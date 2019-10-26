package com.example.SI_KRS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText et_email;
    EditText et_password;
    Button btnAdmin;
    Button btnDosen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_email = (EditText) findViewById(R.id.txtEmail);
        et_password = (EditText) findViewById(R.id.txtPassword);
        btnAdmin =(Button)findViewById(R.id.btnAdmin);
        btnAdmin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+";


                String email = et_email.getText().toString();

                Matcher matcher= Pattern.compile(validemail).matcher(email);


                if (matcher.matches()){
                    Intent intent = new Intent(MainActivity.this, menuAdmin.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Enter Valid Email-Id",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnDosen =(Button)findViewById(R.id.btnDosen);
        btnDosen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+";


                String email = et_email.getText().toString();

                Matcher matcher= Pattern.compile(validemail).matcher(email);


                if (matcher.matches()){
                    Intent intent = new Intent(MainActivity.this, menuDosen.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Enter Valid Email-Id",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
