package com.example.demo_app_doc_truyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputLayout;

public class DangKy_Activity extends AppCompatActivity {
    TextInputLayout edtSDT, edtDC, edtHoTen, edtMk, edtMkck;
    Button btnDK, btnHuy;
    RadioButton rbNam;
    RadioGroup radioGroup;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        setTitle("Dang Ky");
        setContentView(R.layout.activity_dang_ky);
        edtDC = findViewById(R.id.edtDiachi);
        edtHoTen = findViewById(R.id.edtHoTen);
        edtMk = findViewById(R.id.edtPassDk);
        edtMkck = findViewById(R.id.edtPassCk);
        edtSDT = findViewById(R.id.edtSDT);
        btnDK = findViewById(R.id.btnDangKyT);
        btnHuy = findViewById(R.id.btnHuy);
        radioGroup = findViewById(R.id.radioG);
        rbNam =findViewById(R.id.rbNam);
        rbNam=findViewById(R.id.rbNu);
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login_Activity.class);
                startActivity(intent);
            }
        });
    }
}