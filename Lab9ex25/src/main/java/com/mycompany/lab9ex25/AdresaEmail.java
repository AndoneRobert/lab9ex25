/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9ex25;

/**
 *
 * @author robii
 */
public class AdresaEmail {
    private String adresa;

    public AdresaEmail(String adresa) {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }
    @Override
    public String toString() {
        return " <" + adresa + ">";
    }
}
