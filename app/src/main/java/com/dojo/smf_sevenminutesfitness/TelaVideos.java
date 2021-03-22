package com.dojo.smf_sevenminutesfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class TelaVideos extends AppCompatActivity {

    WebView meuWebView;
    TextView meuTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_videos);

        meuWebView = findViewById(R.id.meuWebView);
        meuTitulo = findViewById(R.id.textoNomeExercicio);

        meuWebView.setWebViewClient(new MyBrowser());

        meuWebView.getSettings().setJavaScriptEnabled(true);
        meuWebView.loadUrl("http://www.youtube.com/embed/" + "nMSmdff4HGM" + "?autoplay=1&vq=small");
        meuWebView.setWebChromeClient(new WebChromeClient());

        String nomeVideo = getIntent().getExtras().getString("nomeVideo");
        meuTitulo.setText(nomeVideo);
    }
    private class MyBrowser extends WebViewClient {
        public  boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}