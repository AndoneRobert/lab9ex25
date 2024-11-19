package com.mycompany.project;

/**
 *
 * @author CosmiN
 */
public class Vehicul {
    int vitezaMaxima;
    int anFabricatie;
    String combustibil;
    
    Vehicul(){
        this.vitezaMaxima = 0;
        this.anFabricatie = 0;
        this.combustibil = "necunoscut";
    }
    
    Vehicul(int vitezaMaxima, int anFabricatie, String combustibil){
        this.vitezaMaxima = vitezaMaxima;
        this.anFabricatie = anFabricatie;
        this.combustibil = combustibil;
    }
    
    Vehicul(Vehicul vehicul2){
        this.vitezaMaxima = vehicul2.vitezaMaxima;
        this.anFabricatie = vehicul2.anFabricatie;
        this.combustibil = vehicul2.combustibil;
    }
    
    @Override
    public String toString(){
        return "Vehiculul are viteza viteza maxima de " + vitezaMaxima + " km/h, este pe baza de " + combustibil + " si este fabricat in anul " + anFabricatie;
    }
}
