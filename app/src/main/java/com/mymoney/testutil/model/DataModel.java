package com.mymoney.testutil.model;

import android.content.Context;

/**
 * @autor wangbinwei
 * @since 2017/7/14 下午4:32
 */

public interface DataModel<T> {
    void loadData(Context context, DataLoadListener<T> listener);

    interface DataLoadListener<T>{
        void onDataLoad(T data);
    }
}
