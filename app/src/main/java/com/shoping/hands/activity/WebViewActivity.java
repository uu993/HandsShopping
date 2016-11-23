package com.shoping.hands.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.widget.TextView;

import com.shoping.hands.R;
import com.shoping.hands.base.BaseActivity;
import com.shoping.hands.manager.Logger;
import com.shoping.hands.manager.WebViewManger;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WebViewActivity extends BaseActivity {

    @Bind(R.id.webview)
    WebView webview;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    private String url = "http://cospdf.ufile.ucloud.com.cn/dagang/dagang_1.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        ButterKnife.bind(this);
    }

    public void initView() {
        toolbarTitle.setText("淘宝");
        WebViewManger.getInstance().initView(WebViewActivity.this, webview, url);
        webview.setWebViewClient(new WebViewClientExtend());
        loadUrl(url);
    }

    public void loadUrl(String url) {
        if (webview != null) {
            Logger.e("url==" + url);
            webview.loadUrl(url);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    class WebViewClientExtend extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
//            mSwipeRefreshLayout.setRefreshing(true);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
//            mSwipeRefreshLayout.setRefreshing(false);
            view.loadUrl("javascript:(function() { var videos = document.getElementsByTagName('video'); for(var i=0;i<videos.length;i++){videos[i].play();}})()");
        }

        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
        }

        @Override
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {
            webview.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
