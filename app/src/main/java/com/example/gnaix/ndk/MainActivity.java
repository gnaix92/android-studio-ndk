package com.example.gnaix.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //调用基础类型
        int len = NativeMethod.getInt(0);
        Log.d(TAG, "serialno length:" + len);

        //调用String类型
        String str = NativeMethod.getString("ro.serialno");
        Log.d(TAG, "serialno : " + str);

        //调用数组
        byte array[] = {'A', 'B', 'C', 'D', 'E'};
        byte[] resutl = NativeMethod.getByteArray(array);
        for (int i = 0; i < array.length; i++) {
            Log.d(TAG, "ARRAY : " + array[i] + "->" + resutl[i]);
        }

        //调用静态方法/变量
        NativeMethod.invokeStaticFieldAndMethod(23, "gnaix");
        Log.d(TAG, "field value:" + Util.STATIC_FIELD);

        //调用实例方法/变量
        NativeMethod.invokeJobject("gnaix", 23);


        //返回对象数组
        Person persons[] =  NativeMethod.getPersons();
        for(Person person : persons){
            person.toString();
        }

    }
}
