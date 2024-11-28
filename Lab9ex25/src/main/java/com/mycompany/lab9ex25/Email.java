/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9ex25;

/**
 *
 * @author robii
 */
public class Email {
    private AdresaEmail expeditor;
    private AdresaEmail destinatar;
    private String subiect;
    private String mesaj;

    public Email(AdresaEmail expeditor, AdresaEmail destinatar, String subiect, String mesaj) {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.subiect = subiect;
        this.mesaj = mesaj;
    }

    public void trimite() {
        System.out.println("Trimitere email...");
        System.out.println(this);
    }

    public void primeste() {
        System.out.println("Email primit de " + destinatar);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "De la: " + expeditor + "\n" +
               "Catre: " + destinatar + "\n" +
               "Subiect: " + subiect + "\n" +
               "Mesaj:\n" + mesaj;
    }

}
