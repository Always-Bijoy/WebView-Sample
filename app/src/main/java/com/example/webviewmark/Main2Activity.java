package com.example.webviewmark;

import android.app.ActionBar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    private WebView MywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        MywebView=findViewById(R.id.webView);

        String url = getIntent().getStringExtra("url");
        MywebView.getSettings().setLoadsImagesAutomatically(true);
        MywebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        MywebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = MywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        MywebView.loadUrl(url);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
