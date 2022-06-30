package com.rivvana.newapplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private EditText Name, Password;
    private Button Login;
    private TextView textBiasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);
        textBiasa = (TextView) findViewById(R.id.textView);

        String bener_username = "admin";
        String bener_password = "admin";

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((TextUtils.isEmpty(Name.getText().toString())) || (TextUtils.isEmpty(Password.getText().toString()))){
                    textBiasa.setText("Masukan data");
                }
                else {
                    if ((Name.getText().toString().equals(bener_username)) && (Password.getText().toString().equals(bener_password))){
                        textBiasa.setText("Login Berhasil");
                    }
                     else {
                        textBiasa.setText("Username atau Password Salah");
                    }
                }

            }
        });
    }
}