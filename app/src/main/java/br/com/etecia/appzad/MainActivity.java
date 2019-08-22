package br.com.etecia.appzad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEntrarjanela2;
    Button btnEntrarjanela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrarjanela2 = (Button) findViewById(R.id.btnAbrirJanela2);

        btnEntrarjanela1 = (Button) findViewById(R.id.btnAbrirJanela1);

        btnEntrarjanela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Clique no botao",
                        Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getApplicationContext(), JanelaDois_activity.class));
            }

        });
    }


}
