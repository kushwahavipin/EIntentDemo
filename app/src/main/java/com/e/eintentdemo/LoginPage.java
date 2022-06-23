package com.e.eintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText un,pwd;
    Button lgn,su;
    String uname="ErVipin",upass="1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        un=findViewById(R.id.un);
        pwd=findViewById(R.id.pwd);
        lgn=findViewById(R.id.lgn);
        su=findViewById(R.id.su);
        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(un.getText().toString().equals(uname)&&pwd.getText().toString().equals(upass))
                {
                    Intent gthp=new Intent(LoginPage.this,HomePage.class);
                    Bundle b=new Bundle();
                    b.putString("name",uname);
                    //b.putString("pass",upass);
                    gthp.putExtras(b);
                    startActivity(gthp);
                }
                else
                {
                    Toast.makeText(LoginPage.this, "Invalid Login", Toast.LENGTH_SHORT).show();
                    un.setError("UserName Not Valid");
                    pwd.setError("Password Not Valid");
                }
            }
        });
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
      /// Login --------------- Register
            }
        });








    }
}