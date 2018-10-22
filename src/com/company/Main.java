package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Kubus cubes = new Kubus();

        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi\t: ");
        cubes.setSisi(inputan.nextInt());
        System.out.print("Massa\t: ");
        cubes.setMassa(inputan.nextInt());

        System.out.println("\n======Massa Jenis Kubus======");
        System.out.println("Volume\t\t: "+cubes.hitungVolume(cubes.getSisi()));
        System.out.println("Massa Jenis : "+cubes.hitungMassaJenis(cubes.getMassa(),
                                            cubes.hitungVolume(cubes.getSisi())));
    }
}
