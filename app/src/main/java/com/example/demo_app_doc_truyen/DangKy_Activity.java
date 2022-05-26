package com.example.demo_app_doc_truyen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class DangKy_Activity extends AppCompatActivity {
    TextInputEditText DateFormat;
    TextInputLayout edtSDT, edtEmail, edtHoTen, edtMk, edtMkck,edtDate;
    Button btnDK, btnHuy;
    RadioButton rbNam;
    RadioGroup radioGroup;
    Intent intent;
    DatePickerDialog.OnDateSetListener onDateSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        setTitle("Dang Ky");
        setContentView(R.layout.activity_dang_ky);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DateFormat=findViewById(R.id.DateFormat);
        edtDate= findViewById(R.id.edtDate);
        edtEmail = findViewById(R.id.edtEmail);
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
        DateFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        DangKy_Activity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        onDateSetListener,year,month,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                datePickerDialog.show();

            }
        });
        onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month =month+1;
                String date = dayOfMonth+"/"+month+"/"+year;
                edtDate.getEditText().setText(date);
            }
        };
    }
}