/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9ex24;

/**
 *
 * @author robii
 */
public class AfterShave extends Cosmetice {
    private boolean contineAlcool;

    public AfterShave(String nume, double pret, String producator, boolean contineAlcool) {
        super(nume, pret, producator);
        this.contineAlcool = contineAlcool;
    }

    @Override
    public String toString() {
        return super.toString() + ", contine alcool? " + (contineAlcool ? "Da" : "Nu");
    }
}