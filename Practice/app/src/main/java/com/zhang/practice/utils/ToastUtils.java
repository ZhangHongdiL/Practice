package com.zhang.practice.utils;

import android.widget.Toast;

import com.zhang.practice.control.app.MyApp;

/**
 * Created by dllo on 16/9/8.
 * Toast的工具类
 * @author zhd
 * @time 2016-9-8 16:13
 * @version 1.0
 */
public final class ToastUtils {
    // final修饰不能继承
    // 私有构造方法: 不能创建对象
    // 锁死这个类
    private ToastUtils() {}

    private static boolean isDebug = true;

    public static void shortMsg(String msg) {
        if (isDebug) {
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }

    public static void langMsg(String msg) {
        if (isDebug) {
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_LONG).show();
        }
    }

}
