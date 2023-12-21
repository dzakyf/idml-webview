package com.example.idmall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wv = findViewById<WebView>(R.id.id_mall_webview)

        wv.webViewClient = WebViewClient()

        //enabling javascript
        wv.settings.javaScriptEnabled = true

        //fetch resource from network instead of using cached data
        wv.settings.cacheMode = WebSettings.LOAD_NO_CACHE

        //resource to be loaded
        wv.loadUrl("https://www.idmall.id")
    }
}