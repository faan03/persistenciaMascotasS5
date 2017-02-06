package com.faan.mascotasrecyclerviewyactionview;

/**
 * Created by FAAN on 05/02/2017.
 */

public class Mascota {
    private String nombreMascota;
    private String  raitingMascota;
    private int  fotoMascota;

    public Mascota (String nombre, String raiting, int foto){
        this.nombreMascota= nombre;
        this.raitingMascota=raiting;
        this.fotoMascota=foto;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaitingMascota() {
        return raitingMascota;
    }

    public void setRaitingMascota(String raitingMascota) {
        this.raitingMascota = raitingMascota;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }
}
