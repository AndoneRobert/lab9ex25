/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab9ex25;

import java.util.Scanner;

/**
 *
 * @author robii
 */
public class Lab9ex25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti detaliile expeditorului:");
        System.out.print("Adresa email expeditor: ");
        String emailExpeditor = scanner.nextLine();
        AdresaEmail expeditor = new AdresaEmail(emailExpeditor);

        System.out.println("\nIntroduceti detaliile destinatarului:");
        System.out.print("Adresa email destinatar: ");
        String emailDestinatar = scanner.nextLine();
        AdresaEmail destinatar = new AdresaEmail(emailDestinatar);

        System.out.println("\nIntroduceti detaliile emailului:");
        System.out.print("Subiect: ");
        String subiect = scanner.nextLine();
        System.out.print("Mesaj: ");
        String mesaj = scanner.nextLine();
        
        Email email = new Email(expeditor, destinatar, subiect, mesaj);
        email.trimite();
        System.out.println();
        email.primeste();
        scanner.close();
    }
}
