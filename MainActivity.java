package com.sunny.smartwebview;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//committing5
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadUrl("https://www.idash.gq/?fff#pin=31231");

        FloatingActionButton fab = findViewById(R.id.fab);
        //fab.setBackgroundColor(Color.YELLOW);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               loadUrl(myWebView.getUrl());
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        //myWebView.reload();//crashed
    }

    public void loadUrl(String url) {
        myWebView = findViewById(R.id.webview);
        myWebView.setWebViewClient(new myWebClient());
        myWebView.loadUrl(url);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }


}
