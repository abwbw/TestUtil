package com.mymoney.outrouter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * @autor wangbinwei
 * @since 2017/7/14 下午4:16
 */

public class OutRouterTestActivity extends FragmentActivity {
    private IOutRouterView mView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_router);

        final OutRouterTestFragment fragment = new OutRouterTestFragment();
        mView = fragment;
        getSupportFragmentManager().beginTransaction().add(R.id.main_fl, fragment).commit();
    }

    @Override
    public void onBackPressed() {
        if(!mView.goBack()){
            super.onBackPressed();
        }
    }
}
