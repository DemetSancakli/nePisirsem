package com.example.neyemekpisirsem.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.neyemekpisirsem.R;

/**
 * Created by demet on 26.11.2017.
 */

public class LoginActivity extends Activity{
    public TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registerTextView = (TextView) findViewById(R.id.registerTextView);
        registerTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
//                i.putExtra("key",value);
                LoginActivity.this.startActivity(i);
            }



        });



    }
}
