package com.example.conta.ratemyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Button button;
    Button btnLogin;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.txtEmail);
                TextView tSenha = (TextView) findViewById(R.id.txtSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if(login.equals("lucasDR")&&senha.equals("senha")){
                    alert("Olá "+login+" :)");
                    startActivity(new Intent(getApplicationContext(), Main2Activity.class));

                }else{
                    alert("Usuário e/ou senha inválido(s)");
                }
            }
        });


        //btnLogin = (Button) findViewById(R.id.btnLogin);
        //btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
    }
   //public void buttonClick(View v){
       // if()
   //    Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_LONG).show();
   //}

   public void alert(String s){
       Toast.makeText(this, s, Toast.LENGTH_LONG).show();

   }


}


