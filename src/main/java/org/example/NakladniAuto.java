package org.example;

public class NakladniAuto extends Auto{

    private int nosnost;        // kg
    private int aktualniNaklad; // kg

    public NakladniAuto(String znacka, int rychlost, int rokVyroby, String model, int nosnost, int aktualniNaklad) {
        super(znacka, rychlost, rokVyroby, model);
        this.nosnost = nosnost;
        this.aktualniNaklad = aktualniNaklad;
    }

    public void vypisInfo(){ //– vypíše kompletní informace o autě
        System.out.println("Značka: " + getZnacka() + "Model: "+ getModel() + "Rok výroby: " + getRokVyroby() + "Nosnost vozidla v kg: "+ nosnost + "Aktuální náklad v kg: : "+aktualniNaklad);
    }

    public void naloz(int kg){
        aktualniNaklad+= kg;
    }

    public void vyloz(int kg){
        aktualniNaklad -= kg;
        if (aktualniNaklad <0 ){
            aktualniNaklad = 0;
        }
    }

    public int getAktualniNaklad() {
        return aktualniNaklad;
    }

    public int getNosnost() {
        return nosnost;
    }


}
