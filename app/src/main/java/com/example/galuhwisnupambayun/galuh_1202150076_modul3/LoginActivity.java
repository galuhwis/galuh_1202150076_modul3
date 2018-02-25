package com.example.galuhwisnupambayun.galuh_1202150076_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Galuh Wisnu Pambayun on 24/02/2018.
 */

public class LoginActivity extends AppCompatActivity {
    Button btnlogin;
    EditText etusername, etpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin = (Button)findViewById(R.id.btnlogin);
        etusername = (EditText)findViewById(R.id.username);
        etpassword = (EditText)findViewById(R.id.password);

        //mengatur action login
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etusername.getText().toString().equals("EAD") && etpassword.getText().toString().equals("MOBILE")){
                    Intent intent = new Intent(LoginActivity.this,RecyclerViewAdapter.class);
                    Toast.makeText(LoginActivity.this,"Selamat Datang",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this,"Username atau Password yang anda masukkan salah, silahkan coba kembali!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
