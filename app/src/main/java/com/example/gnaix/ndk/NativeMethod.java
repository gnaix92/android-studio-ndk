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
     * 基础类型调用
     * @param i
     * @return
     */
    public static native int getInt(int i);

}
