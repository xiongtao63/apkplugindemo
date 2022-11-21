package com.enjoy.plugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("leo", "onCreate: 启动了插件的Activity");
//        Intent intent = getIntent();
//        String leo = intent.getStringExtra("leo");
//        Log.e("leo", "onCreate: " + leo);

        // 资源加载
//        setContentView(R.layout.activity_main);

        View view = LayoutInflater.from(mContext).inflate(R.layout.activity_main, null);
        setContentView(view);

    }
}
