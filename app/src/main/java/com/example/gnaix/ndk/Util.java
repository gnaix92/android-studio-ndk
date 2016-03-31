package com.example.gnaix.ndk;

import android.util.Log;

/**
 * 名称: Util
 * 描述:
 *
 * @author xiangqing.xue
 * @date 16/3/11
 */
public class Util {
    private static String TAG = "Util";

    public static int STATIC_FIELD = 300;

    public static String getStaticMethod(String name, int age){
        String str =  "Hello "+ name + ", age:" + age;
        Log.d(TAG, str);
        return str;
    }
}
