
package com.mycompany.project;

public class Tractor extends Vehicul {

    private int putereMotor, capacitateMotor;
    private String tipRoti, tipTractiune;
    private boolean esteCuCabina;

    public Tractor() {
        super();
        putereMotor = 0;
        capacitateMotor = 0;
        tipRoti = "Necunoscut";
        tipTractiune = "Necunoscut";
        esteCuCabina = false;
    }

    public Tractor(int vitezaMaxima, int anFabricatie, String combustibil, int putereMotor, int capacitateMotor, String tipRoti, String tipTractiune, boolean esteCuCabina) {
        super(vitezaMaxima, anFabricatie, combustibil);
        this.putereMotor = putereMotor;
        this.capacitateMotor = capacitateMotor;
        this.tipRoti = tipRoti;
        this.tipTractiune = tipTractiune;
        this.esteCuCabina = esteCuCabina;
    }

    public Tractor(Tractor tractor) {
        super(tractor);
        this.putereMotor = tractor.putereMotor;
        this.capacitateMotor = tractor.capacitateMotor;
        this.tipRoti = tractor.tipRoti;
        this.tipTractiune = tractor.tipTractiune;
        this.esteCuCabina = tractor.esteCuCabina;
    }

    public int getPutereMotor() {
        return putereMotor;
    }

    public void setPutereMotor(int putereMotor) {
        this.putereMotor = putereMotor;
    }

    public int getCapacitateMotor() {
        return capacitateMotor;
    }

    public void setCapacitateMotor(int capacitateMotor) {
        this.capacitateMotor = capacitateMotor;
    }

    public boolean getEsteCuCabina() {
        return esteCuCabina;
    }

    public void setEsteCuCabina(boolean esteCuCabina) {
        this.esteCuCabina = esteCuCabina;
    }

    public String getTipTractiune() {
        return tipTractiune;
    }

    public void setTipTractiune(String tipTractiune) {
        this.tipTractiune = tipTractiune;
    }

    public String getTipRoti() {
        return tipRoti;
    }

    public void setTipRoti(String tipRoti) {
        this.tipRoti = tipRoti;
    }

    @Override
    public void pornire() {
        System.out.println("Tractorul a pornit");
    }

    @Override
    public void oprire() {
        System.out.println("Tractorul s-a oprit");
    }
    @Override
    public String toString() {
        return super.toString() + ", putere motor: " + putereMotor + ", capacitate motor: " + capacitateMotor + ", tip roti: " + tipRoti + ", tip tractiune: " + tipTractiune + ", este cu cabina: " + esteCuCabina;
    }

}