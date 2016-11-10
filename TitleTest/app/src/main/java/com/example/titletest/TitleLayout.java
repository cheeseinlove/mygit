package com.example.titletest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by 讯 on 2016/11/10.
 */
public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.title, this);
        Button btnTitleBack = (Button)findViewById(R.id.btn_back);
        Button btnTitleEdit = (Button)findViewById(R.id.btn_edit);
        btnTitleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();  //销毁该Activity
            }
        });

        btnTitleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "You clicked Edit Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
