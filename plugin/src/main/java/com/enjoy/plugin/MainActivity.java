package com.enjoy.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("leo", "onCreate: 启动了插件的Activity");
//        Intent intent = getIntent();
//        String leo = intent.getStringExtra("leo");
//        Log.e("leo", "onCreate: " + leo);

        // 资源加载
//        setContentView(R.layout.activity_main);
    }
}
