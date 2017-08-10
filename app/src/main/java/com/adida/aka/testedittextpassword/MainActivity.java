package com.adida.aka.testedittextpassword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgShowAndHidePass;
    private EditText tvPassword;
    private boolean isShowPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgShowAndHidePass = (ImageView) findViewById(R.id.imgShowAndhidePass);
        tvPassword = (EditText) findViewById(R.id.tvPassword);
        imgShowAndHidePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isShowPass){
                    isShowPass = true;
                    tvPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }else {
                    isShowPass = false;
                    tvPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                tvPassword.setSelection(tvPassword.length());
            }
        });
    }
}
