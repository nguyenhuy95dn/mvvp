package com.framgia.fdms.feature.authenication.register;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.framgia.fdms.R;

import static com.framgia.fdms.feature.authenication.login.LoginActivity.FONT_SPEED_LINE;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    public void initView() {
        TextView textRegister = (TextView) findViewById(R.id.text_register);
        Typeface typeface = Typeface.createFromAsset(getAssets(), FONT_SPEED_LINE);
        textRegister.setTypeface(typeface);
    }
}