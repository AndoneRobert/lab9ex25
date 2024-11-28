/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9ex24;

/**
 *
 * @author robii
 */
public class CremaFata extends Cosmetice {
    private boolean antiRid;

    public CremaFata(String nume, double pret, String producator, boolean antiRid) {
        super(nume, pret, producator);
        this.antiRid = antiRid;
    }

    @Override
    public String toString() {
        return super.toString() + ", este anti-rid? " + (antiRid ? "Da" : "Nu");
    }
}