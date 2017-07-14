package com.mymoney.testutil.data;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @autor wangbinwei
 * @since 2017/7/14 下午5:53
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef()
public @interface EntranceType {
    int OUT_ROUTER = 1;
    int INNER_ROUTER = 2;
}
