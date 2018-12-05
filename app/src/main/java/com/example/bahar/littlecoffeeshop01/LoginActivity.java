package com.example.bahar.littlecoffeeshop01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText kullaniciadi1;
    private EditText parola1;
    private Button btnlogin;
    private Button btnkayit;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        kullaniciadi1=(EditText) findViewById(R.id.kullaniciadi1);
        parola1=(EditText) findViewById(R.id.parola1);

    }
    private void validate(String username, String userpassword){
        if ((username=="bahar") && (userpassword=="1234")){
            ((Button )findViewById(R.id.BtnKesfet)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LoginActivity.this,üyebilgisi.class));
                }
            });
        }
            else {
            Toast.makeText(getApplicationContext(), "Yanlıs kullanıcı adı veya parola!", Toast.LENGTH_LONG).show();
        }
        }


     @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
       ((Button )findViewById(R.id.btnyenikayit)).setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,yenikayıt.class));
            }
        });


    }
}
