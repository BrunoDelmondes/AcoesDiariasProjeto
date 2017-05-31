package com.example.lab1.acoesdiarias;


import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UsuarioActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_login);

        final EditText u = (EditText) findViewById(R.id.edtCadastroUsuario);
        final EditText s = (EditText) findViewById(R.id.edtCadastroSenha);
        final Button ok = (Button) findViewById(R.id.botaoCadastro);

        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(UsuarioActivity.this,Lembrete.class);
                        intent.putExtra("usuario",u.getText().toString());
                        startActivity(intent);

            }
        });






    }
}
