package com.example.yf.beatbox;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by YF on 2016/7/6.
 */
public class BeatBoxFragment extends Fragment {

    public static BeatBoxFragment newInstance(){
        return new BeatBoxFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_beat_box , container , false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_beat_box_recycle_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity() , 3));

        //使用SoundAdapter
        recyclerView.setAdapter(new SoundAdapter());

        return view;
    }

    /*
    * 创建SoundHolder
    * */
    private class SoundHolder extends RecyclerView.ViewHolder{

        private Button mButton;

        public SoundHolder(LayoutInflater layoutInflater , ViewGroup container) {
            super(layoutInflater.inflate(R.layout.list_item_sound , container ,false));

            mButton = (Button) itemView.findViewById(R.id.list_item_sound_button);
        }
    }

    /*
    * 创建SoundAdapter
    * */
    private class SoundAdapter extends  RecyclerView.Adapter<SoundHolder>{

        @Override
        public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new SoundHolder(inflater , parent);
        }

        @Override
        public void onBindViewHolder(SoundHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }


}
