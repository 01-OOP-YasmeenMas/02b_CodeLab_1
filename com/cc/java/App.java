package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        

        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        output(String.valueOf(konto1.getKontostand()));
        output(String.valueOf(konto2.getKontostand()));
        output(String.valueOf(konto3.getKontostand()));

        output("------------------");

        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        output(String.valueOf(konto1.getKontostand()));
        output(String.valueOf(konto2.getKontostand()));
        output(String.valueOf(konto3.getKontostand()));
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}