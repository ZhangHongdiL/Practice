package com.zhang.practice.control.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhang.practice.R;

/**
 * Created by dllo on 16/9/8.
 * Activity 的基类
 */
public abstract class AbsBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 订制流程
        setProgress(setLayout());
        // 初始化组件
        initViews();
        // 初始化数据
        initDatas();
    }

    /**
     * 设置布局文件
     * @return R.layout.xx
     */
    protected abstract int setLayout();

    /**
     * 初始化组件
     */
    protected abstract void initViews();

    /**
     * 初始化数据
     */
    protected abstract void initDatas();

    /**
     * 简化findViewById
     */
    protected <T extends View> T byView(int resId) {
        return (T) findViewById(resId);
    }

    /**
     * 简单的跳转(不传值)
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to) {
        startActivity(new Intent(from, to));
//        overridePendingTransition();
    }

    /**
     * 跳转传值
     * Bundle: 轻量级的存储类, 存储一些key-value形式的数据
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to, Bundle extras) {
        Intent intent = new Intent();
        intent.putExtras(extras);
        startActivity(intent);
//        overridePendingTransition();
    }

    /**
     * Activity结束动画
     */
    @Override
    public void finish() {
        super.finish();
//        overridePendingTransition(R.anim.xx, R.anim.xx);
    }
}
