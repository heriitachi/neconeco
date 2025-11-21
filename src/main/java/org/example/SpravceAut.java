package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpravceAut {
    private ArrayList<Auto> seznamAut = new ArrayList<>();

    public void pridejAuto(Auto auto) {
        seznamAut.add(auto);
    }

    public void vypisVsechnaAuta() {
        System.out.println("Všechny auta: ");
        for (Auto auto : seznamAut) {
            auto.vypisInfo();
        }
    }

    public List<Auto> najdiAutaPodleZnacky(String znacka) {
        List<Auto> matchingZnacka = new ArrayList<>();

        for (Auto auto : seznamAut) {
            if (auto.getZnacka().equals(znacka)) {
                matchingZnacka.add(auto);
            }
        }

        return matchingZnacka;
    }

    public List<Auto> najdiAutaPodleRoku(int rokOd, int rokDo) {
        List<Auto> matchingRok = new ArrayList<>();

        for (Auto auto : seznamAut) {
            if (auto.getRokVyroby() > rokOd && auto.getRokVyroby() < rokDo) {
                matchingRok.add(auto);
            }

        }
        return matchingRok;
    }

    public List<Auto> najdiRychlaAuta(int minRychlost){
        List<Auto> matchingRychlost = new ArrayList<>();

        for (Auto auto : seznamAut) {
            if (auto.getRychlost() > minRychlost) {
                matchingRychlost.add(auto);
            }

        }
        return matchingRychlost;
    }


    public List<NakladniAuto> najdiNakladniAutaSNakladem(){
        List<NakladniAuto> autaSNakladem = new ArrayList<>();

        for (Auto auto : seznamAut) {
            if (auto instanceof  NakladniAuto) {
                NakladniAuto nakladniAuto = (NakladniAuto) auto;
                if (nakladniAuto.getAktualniNaklad() < 0){
                    autaSNakladem.add(nakladniAuto);
                }
            }

        }
        return autaSNakladem;
    }

    public List<OsobniAuto> najdiOsobniAutaSPocetemMist(int minPocetMist){
        List<OsobniAuto> autaSPoctemMist= new ArrayList<>();

        for (Auto auto : seznamAut) {
            if (auto instanceof  OsobniAuto) {
                OsobniAuto osobniAuto = (OsobniAuto) auto;
                if (osobniAuto.getPocetMist() < minPocetMist){
                    autaSPoctemMist.add(osobniAuto);
                }
            }

        }
        return autaSPoctemMist;
    }



    public double prumerneStariAut(){
        int aktualniRok = 2025;
        double soucet = 0;

        for (Auto auto : seznamAut){
            soucet += (aktualniRok - auto.getRokVyroby());

        }
        return soucet / seznamAut.size();
    }



    public int pocetOsobnichAut(){
        int pocet = 0;
        for (Auto auto : seznamAut){
            if (auto instanceof OsobniAuto){
                pocet++;
            }
        }
        return pocet;
    }

    public int pocetNakladnichAut(){
        int pocet = 0;
        for (Auto auto : seznamAut){
            if (auto instanceof NakladniAuto){
                pocet++;
            }
        }
        return pocet;
    }


    public Auto nejnovejsiAuto(){
        Auto nejnovejsiAuto = seznamAut.get(0);
        for (Auto auto : seznamAut){
            if (auto.getRokVyroby()>nejnovejsiAuto.getRokVyroby()){
                nejnovejsiAuto = auto;
            }
        }
        return nejnovejsiAuto;
    }





}







