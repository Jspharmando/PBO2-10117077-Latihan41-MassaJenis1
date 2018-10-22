package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi(){

        return sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getMassa(){

        return massa;
    }
    public void setMassa(int massa){
        this.massa = massa;
    }
    public int hitungVolume(int parSisi){

        return parSisi*parSisi*parSisi;
    }
    public int hitungMassaJenis(int parMassa, int volume){
        //  volume = hitungVolume(this.sisi);   //
        //  parMassa = this.massa;              //
        return parMassa/volume;
    }
}
