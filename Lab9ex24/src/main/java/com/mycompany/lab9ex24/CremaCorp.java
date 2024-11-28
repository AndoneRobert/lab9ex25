/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9ex24;

/**
 *
 * @author robii
 */
public class CremaCorp extends Cosmetice {
    private String aroma;

    public CremaCorp(String nume, double pret, String producator, String aroma) {
        super(nume, pret, producator);
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        return super.toString() + ", aroma de " + aroma;
    }
}
