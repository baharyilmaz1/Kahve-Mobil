package com.example.bahar.littlecoffeeshop01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class yenikayıt extends AppCompatActivity {
  private   EditText kullaniciadi;
  private   EditText parola;
  private EditText parolatekrar;
  private   Button btnolustur;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yenikayit);
         kullaniciadi=(EditText) findViewById(R.id.kullaniciadi);
         parola=(EditText) findViewById(R.id.parola);
         parolatekrar=(EditText) findViewById(R.id.parolatekrar);
         btnolustur=(Button) findViewById(R.id.btnolustur);

    }

}
