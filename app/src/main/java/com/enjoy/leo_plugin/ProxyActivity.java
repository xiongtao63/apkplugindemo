package com.enjoy.leo_plugin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * 替插件的类做检测的
 */
public class ProxyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("leo", "onCreate: 我是代理的Activity");
    }
}
