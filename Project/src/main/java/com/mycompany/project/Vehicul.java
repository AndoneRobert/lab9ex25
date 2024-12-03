package com.mycompany.project;

public class Vehicul extends ActiuniVehicul{
    int anFabricatie;
    int vitezaMaxima;
    String combustibil;

    public Vehicul() {
        anFabricatie = 0;
        vitezaMaxima = 0;
        combustibil = null;
    }

    public Vehicul(int anFabricatie, int vitezaMaxima, String combustibil) {
        this.anFabricatie = anFabricatie;
        this.vitezaMaxima = vitezaMaxima;
        this.combustibil = combustibil;
    }

    public Vehicul(Vehicul vehicul) {
        this.anFabricatie = vehicul.anFabricatie;
        this.vitezaMaxima = vehicul.vitezaMaxima;
        this.combustibil = vehicul.combustibil;
    }

    @Override
    public void pornire() {
        System.out.println("Vehiculul a pornit.");
    }

    @Override
    public void oprire() {
        System.out.println("Vehiculul s-a oprit.");
    }

    @Override
    public String toString() {
        return "Vehiculul are viteza viteza maxima de " + vitezaMaxima + " km/h, este pe baza de " + combustibil + " si este fabricat in anul " + anFabricatie;
    }
}