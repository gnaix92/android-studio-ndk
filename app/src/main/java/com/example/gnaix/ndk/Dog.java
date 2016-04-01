package com.example.gnaix.ndk;

import android.util.Log;

/**
 * 名称: Dog
 * 描述:
 *
 * @author xiangqing.xue
 * @date 16/4/1
 */
public class Dog extends Animal{

    private String TAG = "Dog";

    public Dog(String name) {
        super(name);
        Log.d(TAG, "Dog Construct call...");
    }

    @Override
    public String getName() {
        return "My name is " + this.name;
    }

    @Override
    public void run() {
        Log.d(TAG, name + "Dog.run...");
    }
}
