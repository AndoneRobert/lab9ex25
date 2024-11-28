/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9ex24;

/**
 *
 * @author robii
 */
public class Cosmetice {
    protected String nume;
    protected double pret;
    protected String producator;

    public Cosmetice(String nume, double pret, String producator) {
        this.nume = nume;
        this.pret = pret;
        this.producator = producator;
    }
    
    public String toString(){
        return "Produsul "+nume+" are pretul de "+pret+" lei, de la "+producator;
    }
}