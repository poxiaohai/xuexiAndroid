package com.example.cheng.android.BaseBottom;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BaseBottomViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_bottom_view);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.BaseBottomView)
    public void onViewClicked() {
        showView();
    }

    private void showView() {
        View view = View.inflate(this, R.layout.layout_bottom, null);
        final BottomSheetDialog bsd1 = new BottomSheetDialog(this);
        bsd1.setContentView(view);
        bsd1.show();
        TextView tv_content1=view.findViewById(R.id.tv_content1);
        tv_content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bsd1.dismiss();
            }
        });

    }
}
