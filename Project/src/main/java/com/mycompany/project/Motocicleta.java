package com.mycompany.project;
import java.awt.Color;
/**
 *
 * @author CosmiN
 */
public class Motocicleta extends Vehicul {
    private Color culoare;
    private String tip; // sport, cruiser, touring, motocross etc.
    private String marca;
    private int capacitateCilindrica; // in cc
    private boolean areLocPasager;
    private int greutate; // in kg

    public Motocicleta() {
        super();
        this.culoare = null;
        this.tip = null;
        this.marca = null;
        this.capacitateCilindrica = 0;
        this.areLocPasager = false;
        this.greutate = 0;
    }

    public Motocicleta(Color culoare, String tip, String marca, int capacitateCilindrica, boolean areLocPasager, int greutate,
                       int vitezaMaxima, int anFabricatie, String combustibil) {
        super(vitezaMaxima, anFabricatie, combustibil);
        this.culoare = culoare;
        this.tip = tip;
        this.marca = marca;
        this.capacitateCilindrica = capacitateCilindrica;
        this.areLocPasager = areLocPasager;
        this.greutate = greutate;
    }

    public Motocicleta(Motocicleta motocicleta) {
        super(motocicleta); // Constructorul de copiere al clasei parinte (Vehicul)
        this.culoare = motocicleta.culoare;
        this.tip = motocicleta.tip;
        this.marca = motocicleta.marca;
        this.capacitateCilindrica = motocicleta.capacitateCilindrica;
        this.areLocPasager = motocicleta.areLocPasager;
        this.greutate = motocicleta.greutate;
    }

    // Getter si setter pentru `culoare`
    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    // Getter si setter pentru `tip`
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    
    // Getter si setter pentru `marca`
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter si setter pentru `capacitateCilindrica`
    public int getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(int capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    // Getter si setter pentru `areLocPasager`
    public boolean getAreLocPasager() {
        return areLocPasager;
    }

    public void setAreLocPasager(boolean areLocPasager) {
        this.areLocPasager = areLocPasager;
    }

    // Getter si setter pentru `greutate`
    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    @Override
    public void pornire(){
        System.out.println("Motocicleta marca " + marca + " a pornit.");
    }
    
    @Override
    public void oprire(){
        System.out.println("Motocicleta marca " + marca + " s-a oprit.");
    }
    
    @Override
    public String toString() {
        return super.toString() +
                ", Motocicleta [Culoare: " + culoare +
                ", Tip: " + tip +
                ", Marca: " + marca +
                ", Capacitate cilindrică: " + capacitateCilindrica + " cc" +
                ", Are loc pasager: " + (areLocPasager ? "Da" : "Nu") +
                ", Greutate: " + greutate + " kg]";
    }
}
