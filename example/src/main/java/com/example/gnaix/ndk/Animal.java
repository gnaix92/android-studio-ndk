package com.example.gnaix.ndk;

import android.util.Log;

/**
 * 名称: Animal
 * 描述:
 *
 * @author xiangqing.xue
 * @date 16/4/1
 */
public class Animal {
    private String TAG = "Animal";

    protected String name;

    public Animal(String name){
        this.name = name;
        Log.d(TAG, "Animal Construct call...");
    }

    public String getName(){
        Log.d(TAG, "Animal.getName Call...");
        return this.name;
    }

    public void run(){
        Log.d(TAG, "Animal.run...");
    }
}
