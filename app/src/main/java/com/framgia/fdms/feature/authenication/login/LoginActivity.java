package com.framgia.fdms.feature.authenication.login;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.framgia.fdms.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    public final static String FONT_SPEED_LINE = "speedline.ttf";
    private TextView mTextLogin;
    private TextView mTextForgotPassword;
    private Button mButtonLogin;
    private Button mButtonCreateAccount;
    private Animation mAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    @Override
    public void onClick(View v) {
        v.startAnimation(mAnimation);
        if (v.getId() == R.id.button_create_account_now) {
            Toast.makeText(this, R.string.msg_notice_progress, Toast.LENGTH_SHORT).show();
        }
    }

    public void initView() {
        mButtonCreateAccount = (Button) findViewById(R.id.button_create_account_now);
        mTextLogin = (TextView) findViewById(R.id.text_login_name);
        mButtonLogin = (Button) findViewById(R.id.button_login);
        mTextForgotPassword = (TextView) findViewById(R.id.text_button_forgot);
        Typeface typeface = Typeface.createFromAsset(getAssets(), FONT_SPEED_LINE);
        mTextLogin.setTypeface(typeface);
        mAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        mButtonCreateAccount.setOnClickListener(this);
        mButtonLogin.setOnClickListener(this);
        mTextForgotPassword.setOnClickListener(this);
    }
}