package com.mycompany.project;

import java.awt.Color;
import java.util.ArrayList;

public class TestareInstante {
    public void main() {
        
        // Crearea instantelor Vehicul
        Vehicul vehicul1 = new Vehicul();
        Vehicul vehicul2 = new Vehicul(2000, 200, "motorina");
        Vehicul vehicul3 = new Vehicul(vehicul2);

        System.out.println("\nInstante Vehicul:");
        System.out.println(vehicul1);
        System.out.println(vehicul2);
        System.out.println(vehicul3);

        // Crearea instantelor Autobuz
        Autobuz autobuz1 = new Autobuz();
        Autobuz autobuz2 = new Autobuz(2015, 120, "motorina", "Mercedes", (byte)50, true, Color.RED, (byte)10);
        Autobuz autobuz3 = new Autobuz(autobuz2);

        System.out.println("\nInstante Autobuz:");
        System.out.println(autobuz1);
        System.out.println(autobuz2);
        System.out.println(autobuz3);

        // Crearea instantelor Motocicleta
        Motocicleta motocicleta1 = new Motocicleta();
        Motocicleta motocicleta2 = new Motocicleta(
            2020, 200, "benzina", Color.BLUE, "sport", "Yamaha", 600, true, 180
        );
        Motocicleta motocicleta3 = new Motocicleta(motocicleta2);

        System.out.println("\nInstante Motocicleta:");
        System.out.println(motocicleta1);
        System.out.println(motocicleta2);
        System.out.println(motocicleta3);
        
        
        // Crearea vectorilor cu 10 elemente din fiecare clasa

        ArrayList<Object> vehicule = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            vehicule.add(new Vehicul(2000 + i, 100 + i, "benzina"));
        }
        for (int i = 5; i < 10; i++) {
            vehicule.add(new Vehicul(2000 + i, 100 + i, "motorina"));
        }
        System.out.println("\nLista vehicule:");
        for (Object v : vehicule) {
            System.out.println(v);
        }

        ArrayList<Object> autobuze = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            autobuze.add(new Autobuz(
                2010 + i,                                          // An fabricație variabil
                90 + i * 5,                                        // Viteză maximă
                i % 2 == 0 ? "motorina" : "benzina",               // Combustibil alternant
                "Marca" + i,                                       // Marca diferita
                (byte) (40 + i),                                   // Numar locuri incrementat
                i % 2 == 0,                                        // Etajat: Da pentru numere pare, Nu pentru impare
                new Color(100 + i * 10, 50 + i * 5, 200 - i * 10), // Culoare variata
               (byte) (i + 1)                                      // Linie diferita
            ));
        }
        System.out.println("\nLista autobuze:");
        for (Object a : autobuze) {
            System.out.println(a);
        }

        ArrayList<Object> motociclete = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            motociclete.add(new Motocicleta(
                2015 + i,                                           // An fabricatie variat
                180 + i * 5,                                        // Viteza maxima variata
                i % 2 == 0 ? "benzina" : "electric",                // Combustibil alternant
                new Color(50 + i * 20, 100 + i * 15, 150 - i * 10), // Culoare variata
                i % 2 == 0 ? "sport" : "cruiser",                   // Tip alternant
                "MarcaMoto" + i,                                    // Marca diferita
                500 + i * 100,                                      // Capacitate cilindrica incrementata
                i % 3 == 0,                                         // Loc pasager: Da pentru multipli de 3
                150 + i * 10                                        // Greutate incrementata
            ));
        }
        System.out.println("\nLista motociclete:");
        for (Object m : motociclete) {
            System.out.println(m);
        }
        
        
        
        
        
        // (Parcurgere-Conditii-etc.)
        // ...
    }
}