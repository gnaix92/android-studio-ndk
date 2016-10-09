LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

#so名
LOCAL_MODULE := native

#编译文件
LOCAL_SRC_FILES := source_file.cpp

#本地依赖包
LOCAL_LDLIBS := -llog -g

#llvm 配置
LOCAL_CFLAGS := -g

#编译动态链接库
include $(BUILD_SHARED_LIBRARY)

