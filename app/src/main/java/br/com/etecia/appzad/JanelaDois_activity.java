package br.com.etecia.appzad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JanelaDois_activity extends AppCompatActivity {

    Button btnAbrirjanela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layout);


        btnAbrirjanela1 = findViewById(R.id.btnAbrirJanela1);

        btnAbrirjanela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Voltou para janela 1",
                        Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }
        });


    }
}
