package com.example.hp.webview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
      public WebView wv;
    public EditText et;
    public ImageView im1,im2,im3,im4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        wv=(WebView)findViewById(R.id.wv);
         et=(EditText)findViewById(R.id.gg);
        im1=(ImageView)findViewById(R.id.fb);
        im2=(ImageView)findViewById(R.id.gm);
        im3=(ImageView)findViewById(R.id.tw);
        im4=(ImageView)findViewById(R.id.html);
        wv.getSettings().setJavaScriptEnabled( true );
        wv.setWebViewClient(new WebViewClient());
        wv.setVerticalScrollBarEnabled(false);
        wv.setHorizontalScrollBarEnabled(false);


    }
    public void test(View view){
        switch (view.getId()){
            case R.id.search:

                wv.loadUrl("https//www.google.com");
                break;
            case R.id.fb:
                wv.loadUrl("https://www.facebook.com");
                break;
            case R.id.gm:
                wv.loadUrl("https://www.gmail.com");
                break;
            case R.id.tw:
                wv.loadUrl("https://www.twitter.com");
                break;
            case R.id.html:
                wv.loadUrl("https://www.youtube.com");
                break;


        }


    }

    }

