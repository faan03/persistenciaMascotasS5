package com.faan.mascotasrecyclerviewyactionview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList <Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
       MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Cerdito","2", R.drawable.cerdito));
        mascotas.add(new Mascota("Ayudante de Santa","5", R.drawable.mascota1));
        mascotas.add(new Mascota("Micho","7", R.drawable.micho));
        mascotas.add(new Mascota("Pluto","4", R.drawable.pluto));
        mascotas.add(new Mascota("Tux","5", R.drawable.tux));

    }
}
