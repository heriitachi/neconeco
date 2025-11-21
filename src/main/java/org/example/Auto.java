package org.example;

public class Auto {

    private String znacka;
    private String model;
    private int rokVyroby;
    private int rychlost;

    public Auto(String znacka, int rychlost, int rokVyroby, String model) {
        this.znacka = znacka;
        this.rokVyroby = rokVyroby;
        this.model = model;
    }



    public void zrychli(int oKolik) {
        rychlost += oKolik;
    }
    public void zpomal(int oKolik){// – sníží rychlost (nesmí být pod 0)
       rychlost -= oKolik;
       if (rychlost<0){
           zastav();
       }
    }

    public void zastav(){// – nastaví rychlost na 0
        rychlost = 0;
    }

    public void vypisInfo(){ //– vypíše kompletní informace o autě
        System.out.println("Značka: " + znacka + "Model: "+ model + "Rok výroby: " + rokVyroby);
    }



    public String getZnacka() {
        return znacka;
    }

    public int getRychlost() {
        return rychlost;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public String getModel() {
        return model;
    }

    //public String toString()


}
