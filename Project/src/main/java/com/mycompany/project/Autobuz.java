package com.mycompany.project;
import java.awt.Color;
/**
 *
 * @author CosmiN
 */
public class Autobuz extends Vehicul {
    private String marca;
    private byte nrLocuri;
    private boolean esteEtajat;
    private Color culoare;
    private byte linie;
    
    public Autobuz(){
        super();
        this.marca = null;
        this.nrLocuri = 0;
        this.esteEtajat = false;
        this.culoare = null;
        this.linie = 0;
    }
    
    public Autobuz(String marca, byte nrLocuri, boolean esteEtajat, Color culoare, byte linie, 
        int vitezaMaxima, int anFabricatie, String combustibil){
        super(vitezaMaxima, anFabricatie, combustibil);
        this.marca = marca;
        this.nrLocuri = nrLocuri;
        this.esteEtajat = esteEtajat;
        this.culoare = culoare;
        this.linie = linie;
    }
    
    public Autobuz(Autobuz autobuz){
        super(autobuz);
        this.marca = autobuz.marca;
        this.nrLocuri = autobuz.nrLocuri;
        this.esteEtajat = autobuz.esteEtajat;
        this.culoare = autobuz.culoare;
        this.linie = autobuz.linie;
    }
    
    // Getter si setter pentru `marca`
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    // Getter si setter pentru `nrLocuri`
    public byte getNrLocuri() {
        return this.nrLocuri;
    }

    public void setNrLocuri(byte nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    // Getter si setter pentru `etajat`
    public boolean getEtajat() {
        return this.esteEtajat;
    }

    public void setEtajat(boolean esteEtajat) {
        this.esteEtajat = esteEtajat;
    }

    // Getter si setter pentru `culoare`
    public Color getCuloare() {
        return this.culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    // Getter si setter pentru `linie`
    public byte getLinie() {
        return this.linie;
    }

    public void setLinie(byte linie) {
        this.linie = linie;
    }
    
    @Override
    public void pornire(){
        System.out.println("Autobuzul marca " + marca + " a pornit.");
    }
    
    @Override
    public void oprire(){
        System.out.println("Autobuzul marca " + marca + " s-a oprit.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Autobuz [Marca: " + marca +
               ", Numar locuri: " + nrLocuri +
               ", Etajat: " + (esteEtajat ? "Da" : "Nu") +
               ", Culoare: " + culoare.toString() +
               ", Linie: " + linie + "]";
    }
}