package com.example.zxl.gittestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTvMyTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mTvMyTest = (TextView) this.findViewById(R.id.tv_my_test);
        mTvMyTest.setText("第一次修改并提交到github等提交的测试");

        mTvMyTest.setTextColor(0xff00ff00);
    }
    
    public void btnTestClick(View btnView) {
        Toast.makeText(this, "btn的点击事件", Toast.LENGTH_SHORT).show();
    }
}
