/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9ex24;

/**
 *
 * @author robii
 */
public class GelDeDus extends Cosmetice {
    private String culoare;

    public GelDeDus(String nume, double pret, String producator, String culoare) {
        super(nume, pret, producator);
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return super.toString() + ", culoarea " + culoare;
    }
}
