package unsa.edu.pe.manualdutic.alumno;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unsa.edu.pe.manualdutic.R;
import unsa.edu.pe.manualdutic.adapter.ViewPagerCustom;

public class InicioEstudiante extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerCustom adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_estudiante);

        tabLayout = findViewById(R.id.tablayout_id_estudiante);
        viewPager = findViewById(R.id.viewpager_id_estudiante);
        adapter = new ViewPagerCustom(getSupportFragmentManager());

        //Agregamos los fragment
        adapter.AddFragment(new FragmentPdfStudent(), "MANUALES");
        adapter.AddFragment(new FragmentVideoStudent(),"VIDEOS");


        //lea la vista
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //agregar dibujo al tab
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_video_library);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_picture_as_pdf);
    }
}
