package com.cc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    
// Antons Lösung

//  List<Konto> konten = new ArrayList<Konto>(Arrays.asList(new Konto(),
//                                                                 new Konto(), 
//                                                                 new Konto()));

//         output(konten);

//         konten.get(0).setKontostand(konten.get(0).getKontostand() * 2);
//         konten.get(1).setKontostand(konten.get(1).getKontostand() * 3);
//         konten.get(2).setKontostand(konten.get(2).getKontostand() * 10);

//         output("---------------------------------");

//         output(konten);
//     }

//     private static void output(String outputStr) {
//         System.out.println(outputStr);
//     }

//     private static void output(List<Konto> konten) {
//         for (Konto konto : konten) {
//             output(String.valueOf(konto.getKontostand()));
//         }


}