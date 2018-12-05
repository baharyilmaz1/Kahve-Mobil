package com.example.bahar.littlecoffeeshop01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class üyebilgisi extends AppCompatActivity {
    TextView ad;
    TextView soyad;
    TextView telefon;
    EditText adtext;
    EditText soyadtext;
    EditText telefontext;
    Button btnduzenle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         ad=(TextView) findViewById(R.id.ad);
         soyad=(TextView) findViewById(R.id.soyad);
         telefon=(TextView) findViewById(R.id.telefon);
         adtext=(EditText) findViewById(R.id.adtext);
         soyadtext=(EditText) findViewById(R.id.sayadtext);
         telefontext=(EditText) findViewById(R.id.telefontext);
         btnduzenle=(Button) findViewById(R.id.btnduzenle);



    }
    private void validate(String username, String userpassword){
        if ((username=="bahar") && (userpassword=="1234")){



        }
    }
}
