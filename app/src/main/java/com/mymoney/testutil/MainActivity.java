package com.mymoney.testutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mymoney.testutil.data.EntranceData;
import com.mymoney.testutil.model.MainDataModel;

public class MainActivity extends AppCompatActivity implements IMainView, View.OnClickListener{
    private LinearLayout mContentLl;

    private IMainPresent mPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContentLl = (LinearLayout) findViewById(R.id.show_ll);

        mPresent = new MainPresent(this, this, new MainDataModel());
    }

    @Override
    public void addContentView(EntranceData data) {
        final View itemView = LayoutInflater.from(this).inflate(R.layout.activity_content_item, null);

        final TextView titleTv = (TextView) itemView.findViewById(R.id.title_tv);
        final TextView contentTv = (TextView) itemView.findViewById(R.id.content_tv);

        titleTv.setText(data.getTitle());
        contentTv.setText(data.getContent());

        itemView.setOnClickListener(this);

        mContentLl.addView(itemView);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.item_ll){
            onContentClick();
        }
    }

    private void onContentClick(){
        mPresent.goOutRouterActivity();
    }
}
