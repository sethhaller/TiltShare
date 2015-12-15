package com.thirteen.tilt;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.WindowManager;

public class MainActivity extends WearableActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }
}
