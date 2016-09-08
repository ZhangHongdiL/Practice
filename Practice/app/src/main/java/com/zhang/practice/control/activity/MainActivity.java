package com.zhang.practice.control.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zhang.practice.R;
import com.zhang.practice.utils.ToastUtils;

public class MainActivity extends AbsBaseActivity {

    private TextView mainTv;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        mainTv = byView(R.id.main_tv);
    }

    @Override
    protected void initDatas() {
        mainTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.langMsg("自己的土司");
                // 跳转
//                goTo(MainActivity.this, MainActivity.class);
                // 跳转传值
//                Bundle bundle = new Bundle();
//                bundle.putString("name", "名字");
//                goTo(MainActivity.this, MainActivity.class, bundle);
            }
        });
    }
}
