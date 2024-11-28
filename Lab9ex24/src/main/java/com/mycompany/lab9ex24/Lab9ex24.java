/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab9ex24;

/**
 *
 * @author robii
 */
public class Lab9ex24 {

    public static void main(String[] args) {
        Sampon sampon1 = new Sampon("care repair", 80, "Indola", "par degradat");
        CremaFata cremaFata1 = new CremaFata("crema anti-rid", 35, "Nivea", true);
        CremaCorp cremaCorp1 = new CremaCorp("Body Superfood", 46.50, "Garnier", "Aloe Vera");
        AfterShave afterShave1 = new AfterShave("Arctic Ice", 30, "Gilette", true);
        GelDeDus gelDeDus1 = new GelDeDus("Pure impact", 18.7, "Nivea", "Albastru");

        System.out.println(sampon1);
        System.out.println(cremaFata1);
        System.out.println(cremaCorp1);
        System.out.println(afterShave1);
        System.out.println(gelDeDus1);
    }
}
