package com.Hotcer;


import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {
    public static void main(String[] args) {
Coche miCoche= new Coche();
miCoche.incrementaP();
int puertas= miCoche.numeroP;
        System.out.println("El numero de puertas es "+ puertas);
    }
}