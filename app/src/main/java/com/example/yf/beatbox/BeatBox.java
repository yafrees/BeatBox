package com.example.yf.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YF on 2016/7/6.
 */
public class BeatBox {

    private static final String TAG = "BeatBox";

    private static final String SOUNDS_FOLDER = "sample_sound";

    private List<Sound> mSounds = new ArrayList<>();


    private AssetManager mAssets;
    public BeatBox(Context context){
        mAssets = context.getAssets();
        loadSounds();
    }

    //查看asssets资源
    private void loadSounds(){
        String[] soundName;
        try {
            soundName = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG , "Found ---" + soundName.length + "--- sounds");
        }
        catch (IOException ioe){
            Log.e(TAG , "Cound not list assets" , ioe);
            return;
        }


        for (String filename : soundName){
            String assetPath = SOUNDS_FOLDER + "/" + filename;
            Sound sound = new Sound(assetPath);
            mSounds.add(sound);
        }


    }

    public List<Sound> getSounds(){
        return mSounds;
    }





}
