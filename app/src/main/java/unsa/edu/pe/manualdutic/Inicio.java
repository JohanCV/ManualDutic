package unsa.edu.pe.manualdutic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {

    private ImageView img;
    private TextView texto;
    private Button btnEstudiante, btnDocente, btnAulavirtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_round);

        img = findViewById(R.id.img_dutic);
        texto = findViewById(R.id.text_bienvenida);
        btnEstudiante = findViewById(R.id.btn_estudiante);
        btnDocente = findViewById(R.id.btn_docente);
        btnAulavirtual = findViewById(R.id.btn_pag_dutic);

        Animation myanimacion = AnimationUtils.loadAnimation(this, R.anim.transition_start);
        img.startAnimation(myanimacion);
        texto.startAnimation(myanimacion);
        btnEstudiante.startAnimation(myanimacion);
        btnDocente.startAnimation(myanimacion);
        btnAulavirtual.startAnimation(myanimacion);
    }

    /** llamando al btn sendMEstudiante */
    public void clickME(View view) {
        Intent i = null;

        switch (view.getId()){
            case R.id.btn_estudiante:
               // i = new Intent(this, MainActivityEstudiante.class);
                break;
            case R.id.btn_docente:
               // i = new Intent(this, MainActivityDocente.class);
                break;
            case R.id.btn_pag_dutic:

                //i = new Intent(this, MainActivityAulaVirtual.class);
        }
        startActivity(i);
    }
}
