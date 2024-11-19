/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author robii
 */
public class Tren extends Vehicul {
    //viteza maxima, combustie, an fabricatie
    private String tipTren;
    private String model;
    private int nrVagoane;
    
    //constructor fara argumente
    public Tren(){
        super();
        this.tipTren = "NULL";
        this.model = "NULL";
        this.nrVagoane = 0;
    }
    
    //constructor cu toate argumentele
    public Tren(int vitezaMaxima, int anFabricatie, String combustibil, String tipTren, String model, int nrVagoane){
        super(vitezaMaxima, anFabricatie, combustibil);
        this.tipTren = tipTren;
        this.model = model;
        this.nrVagoane = nrVagoane;
    }
    
    //constructor de copiere
    public Tren(Tren tren){
        super(tren);
        this.tipTren = tren.tipTren;
        this.model = tren.model;
        this.nrVagoane = tren.nrVagoane;
    }
    
    public String getTipTren(){
        return tipTren;
    }
    
    public void setTipTren(String tipTren){
        this.tipTren =  tipTren;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public int getNrVagoane(){
        return nrVagoane;
    }
    
    public void setNrVagoane(int nrVagoane){
        this.nrVagoane = nrVagoane;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", tren "+tipTren+" model de tip "+model+ "are"+nrVagoane+" vagoane";
    }
}
