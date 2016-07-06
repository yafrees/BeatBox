package com.example.yf.beatbox;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected BeatBoxFragment createFragment() {
        return BeatBoxFragment.newInstance();
    }


}
