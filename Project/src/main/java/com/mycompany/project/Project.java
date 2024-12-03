/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

/**
 *
 * @author robii
 */
public class Project {

    public static void main(String[] args) {
        Tren tren1 = new Tren(2014,120,"diesel-electric","Wabtec","ES44AC", 12, "marfar", "Danemarca","WI-FI",125);
        Tren tren2 = new Tren(2020,360,"electric","JR Central","N700S", 16 ,"de pasageri de mare viteza", "Japonia","WI-FI, scaune rabatabile, aer conditionat", 400);
        Tren tren3 = new Tren(2007,350,"electric","Siemens","Velaro E", 8,"de mare viteza interurban", "Spania","WI-FI, mese pliante, scaune ergonomice",200);
        System.out.println(tren1);
        System.out.println(tren2);
        System.out.println(tren3);
 
        System.out.println();
        
        Vapor vapor1 = new Vapor(2018, 41, "motorina marina","Royal Caribbean International","Oasis-class",228081,"Finlanda","de croaziera","piscina, restaurante, teatre, spatii comerciale",362);
        Vapor vapor2 = new Vapor(2002, 30, "pacura marina","Hellespont Shipping Corp.","ULCC",441585,"Coreea de Sud","petrolier","sistem modern de incarcare/descarcare",380);
        Vapor vapor3 = new Vapor(2021, 41,"motorina marina si gaz natural lichefiat","Evergreen Marine", "Evergreen A-Class", 235579,"China","portcontainer","sistem automatizat de gestionare a incarcaturii",400);
        System.out.println(vapor1);
        System.out.println(vapor2);
        System.out.println(vapor3);
        
        Tren[] trenuri = new Tren[10];
        trenuri[0] = new Tren(2020, 360, "Electric", "JR Central", "N700S", 16, "De mare viteza", "Japonia", "WI-FI, scaune rabatabile, aer conditionat", 400);
        trenuri[1] = new Tren(2007, 350, "Electric", "Siemens", "Velaro E", 8, "Intercity", "Spania", "WI-FI, masa pliabila, prize", 200);
        trenuri[2] = new Tren(2015, 160, "Electric", "Alstom", "Coradia Liner", 6, "Regional", "Franta", "Scaune ergonomice, aer conditionat", 120);
        trenuri[3] = new Tren(2010, 380, "Electric", "Bombardier", "Zefiro 380", 8, "De mare viteza", "China", "WI-FI, prize, restaurant", 205);
        trenuri[4] = new Tren(2017, 200, "Diesel-electric", "Hitachi", "Class 800", 9, "Intercity", "Marea Britanie", "WI-FI, aer conditionat, scaune confortabile", 260);
        trenuri[5] = new Tren(2006, 250, "Electric", "Talgo", "250", 11, "Regional", "Spania", "WI-FI, scaune rabatabile, prize", 183);
        trenuri[6] = new Tren(2014, 160, "Electric", "CAF", "Civity", 4, "Commuter", "Italia", "Aer conditionat, scaune ergonomice", 75);
        trenuri[7] = new Tren(2012, 200, "Electric", "Stadler", "KISS", 6, "Regional", "Elvetia", "Prize, WI-FI", 150);
        trenuri[8] = new Tren(2015, 160, "Electric", "Pesa", "DART", 6, "Intercity", "Polonia", "WI-FI, aer conditionat", 130);
        trenuri[9] = new Tren(2010, 305, "Electric", "Hyundai Rotem", "KTX-II", 20, "De mare viteza", "Coreea de Sud", "Prize, restaurant, aer conditionat", 388);        
        
        Vapor[] vapoare = new Vapor[10];
        vapoare[0] = new Vapor(2018, 41, "Motorina marina", "Royal Caribbean International", "Oasis-class", 228081, "Finlanda", "De croaziera", "Piscina, restaurante, teatre, spatii comerciale", 362);
        vapoare[1] = new Vapor(2002, 27, "Pacura marina", "Hellespont", "TI Europe", 441585, "Coreea de Sud", "Petrolier", "Spatii de depozitare", 380);
        vapoare[2] = new Vapor(2013, 39, "Motorina marina", "Norwegian Cruise Line", "Breakaway", 155000, "Norvegia", "De croaziera", "Piscina, restaurante, cazinouri", 324);
        vapoare[3] = new Vapor(2015, 24, "Pacura marina", "MSC", "MSC Zoe", 192237, "Coreea de Sud", "Container", "Macarale automate, containere standardizate", 395);
        vapoare[4] = new Vapor(2018, 41, "Motorina marina", "Carnival", "Carnival Horizon", 133500, "Italia", "De croaziera", "Piscina, cinema, spatii comerciale", 323);
        vapoare[5] = new Vapor(2006, 25, "Pacura marina", "Maersk", "Emma Maersk", 156907, "Danemarca", "Container", "Macarale automate, containere refrigerate", 398);
        vapoare[6] = new Vapor(2003, 30, "Motorina marina", "Cunard", "Queen Mary 2", 149215, "Franta", "Pasager", "Piscina, restaurante, sala de bal", 345);
        vapoare[7] = new Vapor(2018, 22, "Pacura marina", "Evergreen", "Ever Given", 219079, "Japonia", "Container", "Macarale automate, containere standardizate", 400);
        vapoare[8] = new Vapor(2016, 41, "Motorina marina", "Royal Caribbean", "Harmony of the Seas", 226963, "Franța", "De croaziera", "Piscina, restaurante, teatre", 362);
        vapoare[9] = new Vapor(2018, 22, "Pacura marina", "COSCO", "COSCO Shipping Universe", 199000, "China", "Container", "Macarale automate, containere standardizate", 399);

        
        System.out.println("\nInstante de trenuri:");
        for(Object tren : trenuri){
            System.out.println(tren);
        }
        
        System.out.println("\nTrenuri produse in Japonia de mare viteza");
        for(Tren tren : trenuri){
            if ("Japonia".equals(tren.getTara()) && "De mare viteza".equals(tren.getTipTren())) {
                    System.out.println(tren);
        }
    }
        System.out.println("\nInstante de vapoare:");
        for(Vapor vapor: vapoare){
            System.out.println(vapor);
        }
        System.out.println("\nVapoare de croaziera cu viteza mai mare de 40km/h");
        for(Vapor vapor:vapoare){
            if("De croaziera".equals(vapor.getTipVapor()) && vapor.vitezaMaxima > 40){
                System.out.println(vapor);
            }
        }
    }
}
