package com.mzansigamestudio;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    WebView gameView = new WebView(this);
    WebSettings settings = gameView.getSettings();

    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);

    gameView.setWebChromeClient(
        new android.webkit.WebChromeClient()
    );

    gameView.loadUrl(
        "file:///android_asset/index.html"
    );

    setContentView(gameView);
}

}
