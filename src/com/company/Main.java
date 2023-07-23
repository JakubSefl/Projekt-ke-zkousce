package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvidencePojistenych evidence = new EvidencePojistenych();
        int volba = 0;

        while (volba != 4) {
            System.out.println("---------------------------");
            System.out.println("Evidence pojistenych");
            System.out.println("---------------------------");
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Pridat noveho pojisteneho");
            System.out.println("2 - Vypsat vsechny pojistene");
            System.out.println("3 - Vyhledat pojisteneho");
            System.out.println("4 - Konec");

            volba = scanner.nextInt();
            scanner.nextLine(); // Přečte znak nového řádku po volbě

            switch (volba) {
                case 1 -> pridatPojisteneho(scanner, evidence);
                case 2 -> vypsatVsechnyPojistene(evidence);
                case 3 -> vyhledatPojisteneho(scanner, evidence);
                case 4 -> System.out.println("Konec programu.");
                default -> System.out.println("Neplatna volba. Zkuste to znovu.");
            }

            System.out.println("Pokracujte libovolnou klavesou...");
            scanner.nextLine(); // Přečte znak nového řádku po ukončení akce
        }

        scanner.close();
    }

    private static void pridatPojisteneho(Scanner scanner, EvidencePojistenych evidence) {
        System.out.println("Zadejte jmeno pojisteneho:");
        String jmeno = scanner.nextLine();

        System.out.println("Zadejte prijmeni:");
        String prijmeni = scanner.nextLine();

        System.out.println("Zadejte telefonni cislo:");
        String telefon = scanner.nextLine();

        System.out.println("Zadejte vek:");
        int vek = scanner.nextInt();
        scanner.nextLine(); // Přečte znak nového řádku po věku

        evidence.pridatPojisteneho(jmeno, prijmeni, vek, telefon);
    }

    private static void vypsatVsechnyPojistene(EvidencePojistenych evidence) {
        evidence.vypsatVsechnyPojistene();
    }

    private static void vyhledatPojisteneho(Scanner scanner, EvidencePojistenych evidence) {
        System.out.println("Zadejte jmeno pojisteneho:");
        String jmeno = scanner.nextLine();

        System.out.println("Zadejte prijmeni:");
        String prijmeni = scanner.nextLine();

        evidence.vyhledatPojisteneho(jmeno, prijmeni);
    }
}
