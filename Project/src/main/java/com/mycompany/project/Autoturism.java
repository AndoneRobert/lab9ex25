package com.mycompany.project;

public class Autoturism extends Vehicul {

    private short numarLocuri;
    private boolean areAerConditionat, esteNou;
    private String marca, model;

    Autoturism() {
        super();
        numarLocuri = 0;
        areAerConditionat = false;
        esteNou = false;
        marca = "Necunoscuta";
        model = "Necunoscut";
    }

    Autoturism(int vitezaMaxima, int anFabricatie, String combustibil, short numarLocuri, boolean areAerConditionat, boolean esteNou, String marca, String model) {
        super(vitezaMaxima, anFabricatie, combustibil);
        this.numarLocuri = numarLocuri;
        this.areAerConditionat = areAerConditionat;
        this.esteNou = esteNou;
        this.marca = marca;
        this.model = model;
    }

    Autoturism(Autoturism autoturism) {
        super(autoturism);
        this.numarLocuri = autoturism.numarLocuri;
        this.areAerConditionat = autoturism.areAerConditionat;
        this.esteNou = autoturism.esteNou;
        this.marca = autoturism.marca;
        this.model = autoturism.model;
    }

    public short getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(short numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public boolean getAreAerConditionat() {
        return areAerConditionat;
    }

    public void setAreAerConditionat(boolean areAerConditionat) {
        this.areAerConditionat = areAerConditionat;
    }

    public boolean getEsteNou() {
        return esteNou;
    }

    public void setEsteNou(boolean esteNou) {
        this.esteNou = esteNou;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void pornire() {
        System.out.println("Autoturismul a pornit.\nFunctioneaza.\nEste incarcat.");
    }

    public void oprire() {
        System.out.println("Autoturismul s-a oprit");
    }

    @Override
    public String toString() {
        return super.toString() + ", marca: " + marca + ", model: " + model + ", numar locuri: " + numarLocuri + ", aer conditionat: " + areAerConditionat;

    }
}