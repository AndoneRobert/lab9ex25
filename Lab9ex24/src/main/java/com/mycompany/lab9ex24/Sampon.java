/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9ex24;

/**
 *
 * @author robii
 */
public class Sampon extends Cosmetice {
    private String tipPar;

    public Sampon(String nume, double pret, String producator, String tipPar) {
        super(nume, pret, producator);
        this.tipPar = tipPar;
    }

    @Override
    public String toString() {
        return super.toString() + ", pentru " + tipPar;
    }
}
