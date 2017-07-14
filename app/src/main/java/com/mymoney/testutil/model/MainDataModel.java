package com.mymoney.testutil.model;

import android.content.Context;

import com.mymoney.testutil.data.EntranceData;
import com.mymoney.testutil.data.EntranceType;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor wangbinwei
 * @since 2017/7/14 下午4:34
 */

public class MainDataModel implements DataModel<List<EntranceData>>{
    private final List<EntranceData> mEntranceData = new ArrayList<>();

    public MainDataModel(){
        initData();
    }

    private void initData(){
        mEntranceData.add(createOutRouterTestEntrance());
        mEntranceData.add(createInnerRouterTestEntrance());
    }

    private EntranceData createOutRouterTestEntrance(){
        return new EntranceData(EntranceType.OUT_ROUTER, "外部路由", "主要在Webview中进行外部路由测试。", "主要在Webview中进行外部路由测试。");
    }

    private EntranceData createInnerRouterTestEntrance(){
        return new EntranceData(EntranceType.INNER_ROUTER,"内部路由", "主要在Webview中进行内部路由测试。", "主要在Webview中进行内部路由测试。");
    }

    public List<EntranceData> getAllEntranceData() {
        final List<EntranceData> entranceData = new ArrayList<>();
        entranceData.addAll(mEntranceData);
        return entranceData;
    }

    @Override
    public void loadData(Context context, DataLoadListener<List<EntranceData>> listener) {
        if(listener != null){
            listener.onDataLoad(getAllEntranceData());
        }
    }
}
