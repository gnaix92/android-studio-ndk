//
// Created by 薛祥清 on 16/3/10.
//

#include "com_example_gnaix_ndk_NativeMethod.h"

using namespace std;

JNIEXPORT jint JNICALL Java_com_example_gnaix_ndk_NativeMethod_getInt
        (JNIEnv *env, jclass object, jint num)
{

    for(int i=0; i< 100; i++)
    {
        num += i;
    }
    return num;
}