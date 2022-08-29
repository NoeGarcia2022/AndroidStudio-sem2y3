package com.nagv.apppractica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SegundaVistaConParametros extends AppCompatActivity {

    WebView Wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_vista_con_parametros);

        Wv1 = (WebView) findViewById(R.id.Wv1);

        String URL = getIntent().getStringExtra("direccion");
        Wv1.setWebViewClient(new WebViewClient());
        Wv1.loadUrl("http://" + URL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void finalizar(View view){
        finish();
    }
}