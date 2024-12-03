package com.mycompany.project;

/**
 *
 * @author robii
 */
public class Tren extends Vehicul {
    
    private String marca;
    private String model;
    private int nrVagoane;
    private String tipTren;
    private String tara;
    private String facilitati;
    private double lungime;
    
    public Tren(){
        super();
        this.marca = "NULL";
        this.model = "NULL";
        this.nrVagoane = 0;
        this.tipTren="NULL";
        this.tara="NULL";
        this.facilitati="NULL";
        this.lungime = 0;
    }
    
    public Tren(int vitezaMaxima, int anFabricatie, String combustibil, String marca, String model, int nrVagoane, String tipTren, String tara, String facilitati, double lungime){
        super(vitezaMaxima, anFabricatie, combustibil);
        this.marca = marca;
        this.model = model;
        this.nrVagoane = nrVagoane;
        this.tipTren=tipTren;
        this.tara=tara;
        this.facilitati=facilitati;
        this.lungime=lungime;
    }
    
    public Tren(Tren tren){
        super(tren);
        this.marca = tren.marca;
        this.model = tren.model;
        this.nrVagoane = tren.nrVagoane;
        this.tipTren=tren.tipTren;
        this.tara=tren.tara;
        this.facilitati=tren.facilitati;
        this.lungime=tren.lungime;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca =  marca;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
    public int getNrVagoane(){
        return nrVagoane;
    }
    public void setNrVagoane(int nrVagoane){
        this.nrVagoane = nrVagoane;
    }
    
    public String getTipTren(){
        return tipTren;
    }
    public void setTipTren(String tipTren){
        this.tipTren=tipTren;
    }
    
    public String getTara(){
        return tara;
    }
    public void setTara(String tara){
        this.tara=tara;
    }
    
    public String getFacilitati(){
        return facilitati;
    }
    public void setFacilitati(String facilitati){
        this.facilitati=facilitati;
    }
    
    public double getLungime(){
        return lungime;
    }
    public void setLungime(double lungime){
        this.lungime=lungime;
    }
    
    @Override
    public String toString(){
        return super.toString() +". Modelul "+model+" de la "+marca+" fabricat in "+tara+" este un tren "+tipTren+" are lungimea de "+lungime+" metri, are "+nrVagoane+" vagoane si este dotat cu "+facilitati+".";
    }
}