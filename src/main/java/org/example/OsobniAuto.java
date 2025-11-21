package org.example;

public class OsobniAuto extends Auto{
    private int pocetMist;
    private int velikostKufru; // litry

    public OsobniAuto(String znacka, int rychlost, int rokVyroby, String model, int pocetMist, int velikostKufru) {
        super(znacka, rychlost, rokVyroby, model);
        this.pocetMist = pocetMist;
        this.velikostKufru = velikostKufru;
    }

    public void vypisInfo(){ //– vypíše kompletní informace o autě
        System.out.println("Značka: " + getZnacka() + "Model: "+ getModel() + "Rok výroby: " + getRokVyroby() + "Počet míst"+ pocetMist + "Velikost kufru v litrech: "+velikostKufru);
    }



    public int getPocetMist() {
        return pocetMist;
    }

    public int getVelikostKufru() {
        return velikostKufru;
    }
}
