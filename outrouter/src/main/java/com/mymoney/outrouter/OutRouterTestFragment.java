package com.mymoney.outrouter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * @autor wangbinwei
 * @since 2017/7/14 下午4:17
 */

public class OutRouterTestFragment extends Fragment implements IOutRouterView{
    private WebView mWebView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View parentView = inflater.inflate(R.layout.fragment_out_router, container, false);

        mWebView = (WebView) parentView.findViewById(R.id.webview_wv);
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient());
        initView();
        return parentView;
    }

    private void initView(){
        mWebView.loadUrl("https://www.baidu.com");
    }

    @Override
    public boolean goBack() {
        if(mWebView != null && mWebView.canGoBack()){
            mWebView.goBack();
            return true;
        }
        return false;
    }
}
