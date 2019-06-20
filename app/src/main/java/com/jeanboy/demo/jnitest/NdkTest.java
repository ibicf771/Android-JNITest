package com.jeanboy.demo.jnitest;

/**
 * Created by Next on 2016/8/12.
 * 使用说明： 生成的so请拷贝到jnilibs目录下使用，运行前需要把jni目录删除，否则会编译不过
 */
public class NdkTest {
    static {
        System.loadLibrary("NdkTestTest");
    }

    public static native String getString();
    public static native int doAdd(int param1,int param2);
}
