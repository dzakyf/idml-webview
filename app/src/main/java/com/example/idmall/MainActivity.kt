package com.example.idmall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wv = findViewById<WebView>(R.id.id_mall_webview)

        wv.webViewClient = WebViewClient()
        wv.loadUrl("https://www.idmall.id")
        wv.settings.javaScriptEnabled = true
    }
}