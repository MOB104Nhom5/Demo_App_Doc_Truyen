package com.example.demo_app_doc_truyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.demo_app_doc_truyen.Fragment.Trangchu_Fragment;
import com.google.android.material.textfield.TextInputLayout;

public class Login_Activity extends AppCompatActivity {
    private TextInputLayout txtUsername;
    private TextInputLayout txtPassword;
    private CheckBox checkRemeber;
    private Button btnDangnhap;
    private Button btnDangky;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("ĐĂNG NHẬP");
        txtUsername = (TextInputLayout) findViewById(R.id.edtUser);
        txtPassword = (TextInputLayout) findViewById(R.id.edtPass);
        btnDangnhap = (Button) findViewById(R.id.btnDangNhap);
        checkRemeber = (CheckBox) findViewById(R.id.checkRemeber);
        btnDangky=(Button) findViewById(R.id.btnDangKy);
        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),DangKy_Activity.class);
                startActivity(intent);
            }
        });
    }
}