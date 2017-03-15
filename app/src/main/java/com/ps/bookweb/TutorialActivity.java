package com.ps.bookweb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.ps.bookweb.R;

/**
 * Created by ps on 2017-03-06.
 */

public class TutorialActivity extends ActionBarActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }

    public void onNextClick(View view) {
    }
}
