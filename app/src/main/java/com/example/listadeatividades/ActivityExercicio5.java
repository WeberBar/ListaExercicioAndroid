package com.example.listadeatividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ActivityExercicio5 extends AppCompatActivity {

    CheckBox checkBoxNotificacao, checkBoxModoEscuro, checkBoxLogin;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        checkBoxNotificacao = findViewById(R.id.notificação);
        checkBoxLogin = findViewById(R.id.lembrarLogin);
        checkBoxModoEscuro = findViewById(R.id.modoEscuro);

        btn = findViewById(R.id.btnsalvar);
        List<String> preferencias = new ArrayList<>();
        btn.setOnClickListener(v -> {
            if (checkBoxNotificacao.isChecked()) preferencias.add("Receber notificações");
            if (checkBoxModoEscuro.isChecked()) preferencias.add("Modo escuro");
            if (checkBoxLogin.isChecked()) preferencias.add("Lembrar login");
            String mensagem = preferencias.isEmpty() ? "Nenhuma preferência foi escolhida" :
                    "Preferências escolhidas: " + String.join(", ", preferencias);

            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
                });
    }
    public void voltar(View view){
        Intent intent = new Intent(ActivityExercicio5.this, MainActivity.class );
        startActivity(intent);
        finish();
    }


}