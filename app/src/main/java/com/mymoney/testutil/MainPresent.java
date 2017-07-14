package com.mymoney.testutil;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.mymoney.outrouter.OutRouterTestActivity;
import com.mymoney.testutil.data.EntranceData;
import com.mymoney.testutil.model.DataModel;

import java.util.List;

/**
 * @autor wangbinwei
 * @since 2017/7/14 下午4:30
 */

public class MainPresent implements IMainPresent, DataModel.DataLoadListener<List<EntranceData>>{
    private final Activity mActivity;
    private final DataModel mDataModle;
    private final IMainView mView;

    public MainPresent(Activity activity, IMainView view, DataModel model){
        mActivity = activity;
        mView = view;
        mDataModle = model;

        show();
    }

    @Override
    public void show() {
        mDataModle.loadData(mActivity, this);
    }

    @Override
    public void goOutRouterActivity() {
        Intent intent = new Intent(mActivity, OutRouterTestActivity.class);
        mActivity.startActivity(intent);
    }

    @Override
    public void onDataLoad(List<EntranceData> data) {
        for(EntranceData data1:data){
            mView.addContentView(data1);
        }
    }
}
