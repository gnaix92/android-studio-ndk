package com.example.gnaix.ndk;

/**
 * 名称: NativeMethod
 * 描述:
 *
 * @author xiangqing.xue
 * @date 16/3/10
 */
public class NativeMethod {


    static{
        System.loadLibrary("native");
    }

    /**
     * 基础类型
     * @param i
     * @return
     */
    public static native int getInt(int i);

    /**
     * string
     * @param str
     * @return
     */
    public static native String getString(String str);

    /**
     * array
     * @param data
     * @return
     */
    public static native byte[] getByteArray(byte[] data);

    /**
     * 调用java对象
     * @param name
     * @param age
     */
    public static native void invokeJobject(String name, int age);

    /**
     * 调用java静态方法
     */
    public static native void invokeStaticFieldAndMethod(int age, String name);

    /**
     * 获取结构体
     * @return
     */
    public static native Person[] getPersons();
}
