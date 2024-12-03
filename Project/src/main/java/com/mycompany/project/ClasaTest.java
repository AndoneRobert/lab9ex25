 package com.mycompany.project;
 import java.util.Scanner;
 public class ClasaTest {
 
     public static void main(String[] args) 

        Vehicul vehicul1=new Vehicul();
        Vehicul vehicul2=new Vehicul(2000, 200, "motorina");
        Vehicul vehicul3=new Vehicul(vehicul2);
        Autoturism autoturism1 = new Autoturism();
        Autoturism autoturism2 = new Autoturism(2004, 150, "motorina", 5, true, false, "VW", "Golf");
        Autoturism autoturism3 = new Autoturism(autoturism2);
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor(1986, 90, "Motorina", 65, 1500, "Goodyear", "4x4", true);
        Tractor tractor3 = new Tractor(tractor2);
        System.out.println(autoturism1);
        System.out.println(autoturism2);
        System.out.println(autoturism3);
        System.out.println(tractor1);
        System.out.println(tractor2);
        System.out.println(tractor3);
      ArrayList<Object> vehicule = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            vehicule.add(new Vehicul(2000 + i, 100 + i, "benzina"));
        }
        System.out.println("\n Lista vehicule:");
        for (Object v : vehicule) {
            System.out.println(v);
        }
        ArrayList<Object> autoturisme = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            autoturisme.add(new Autoturism(2000 + i, 150 + i, "benzina", 5, true, false, "Marca" + (1 + i), "Model" + (1 + i)));
        }
        System.out.println("\nLista autoturisme:");
        for (Object a : autoturisme) {
            System.out.println(a);
        }
        ArrayList<Object> tractoare = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tractoare.add(new Tractor(1986 + i, 90 + i, "motorina", 65 + i, 1500 + i, "Goodyear", "4x4", false));
        }
        System.out.println("\n Lista tractoare: ");
        for (Object t : tractoare) {
            System.out.println(t);
        }







    }
}


        
    
 