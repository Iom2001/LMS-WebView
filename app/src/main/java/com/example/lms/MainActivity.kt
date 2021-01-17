package com.example.lms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit var mWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mWebView = findViewById(R.id.webView)
        mWebView.loadUrl("https://lms.tuit.uz/dashboard/news")
        val webSettings = mWebView.settings
        webSettings.javaScriptEnabled = true
        mWebView.webViewClient = WebViewClient()
    }

    override fun onBackPressed() {
        if (mWebView.canGoBack()){
                mWebView.goBack()
            }
        else {
            super.onBackPressed()
        }
    }
}
