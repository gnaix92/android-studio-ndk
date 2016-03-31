package com.example.gnaix.ndk;

import android.util.Log;

/**
 * 名称: Person
 * 描述:
 *
 * @author xiangqing.xue
 * @date 16/3/10
 */
public class Person {
    private String TAG = "Person";

    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        String result =  "Name: " + name + ", age: " + age;
        Log.d(TAG, result);
        return result;
    }
}
