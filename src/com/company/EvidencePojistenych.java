package com.company;

import java.util.ArrayList;
import java.util.List;

public class EvidencePojistenych {
    private final List<Pojisteny> seznamPojistenych;

    public EvidencePojistenych() {
        seznamPojistenych = new ArrayList<>();
    }

    public void pridatPojisteneho(String jmeno, String prijmeni, int vek, String telefon) {
        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefon);
        seznamPojistenych.add(pojisteny);
        System.out.println("Data byla ulozena.");
    }

    public void vypsatVsechnyPojistene() {
        if (seznamPojistenych.isEmpty()) {
            System.out.println("Neexistuji zadni pojisteni.");
        } else {
            System.out.println("Seznam vsech pojistenych:");
            for (Pojisteny pojisteny : seznamPojistenych) {
                System.out.println(pojisteny);
            }
        }
    }

    public void vyhledatPojisteneho(String jmeno, String prijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmeno().equalsIgnoreCase(jmeno) && pojisteny.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println("Nalezeny pojisteny: " + pojisteny);
                return;
            }
        }
        System.out.println("Pojisteny s danym jmenem a prijmenim nebyl nalezen.");
    }
}
