package com.enjoy.leo_plugin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.lang.reflect.Method;

import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                privateClassLoader();

                // 这个是直接加载，有两个dexElements
//                PathClassLoader dexClassLoader = new PathClassLoader("/sdcard/test.dex",
//                        MainActivity.this.getClassLoader());
//                try {
//                    Class<?> clazz = dexClassLoader.loadClass("com.enjoy.plugin.Test");
//                    Method method = clazz.getMethod("print");
//                    method.invoke(null);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }

                try {
                    Class<?> clazz = Class.forName("com.enjoy.plugin.Test");
                    Method method = clazz.getMethod("print");
                    method.invoke(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
    }


    private void privateClassLoader() {
        ClassLoader classLoader = getClassLoader();

        while (classLoader != null) {
            Log.e("leo", "privateClassLoader: " + classLoader);
            classLoader = classLoader.getParent();
        }
        Log.e("leo", "privateClassLoader: " + Activity.class.getClassLoader());
        Log.e("leo", "privateClassLoader: " + AppCompatActivity.class.getClassLoader());
    }

}
