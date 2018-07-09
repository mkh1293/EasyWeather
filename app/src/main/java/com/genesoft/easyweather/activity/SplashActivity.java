package com.genesoft.easyweather.activity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.genesoft.easyweather.R;

import java.lang.ref.WeakReference;

public class SplashActivity extends AppCompatActivity{

    private static class MyHandler extends Handler {

        private final WeakReference<SplashActivity> activityWeakReference;

        public MyHandler(SplashActivity splashActivity) {
            activityWeakReference = new WeakReference<SplashActivity>(splashActivity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            SplashActivity splashActivityRef = activityWeakReference.get();
            switch (msg.what) {
                case 1:
                    if(splashActivityRef != null) {
                        splashActivityRef.startActivity(new Intent().setAction("mainActivity"));
                        splashActivityRef.finish();
                    }
                    break;
            }
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new MyHandler(this).sendEmptyMessageDelayed(1, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
