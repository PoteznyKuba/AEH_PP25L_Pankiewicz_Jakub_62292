package pl.pp;

import java.util.Scanner;
import java.util.Random;

public class losowanieLiczb {
    public static void main(String[] args) {
        // Komunikat powitalny
        System.out.println("Witaj w grze Lotto - Losowanie :D!!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Deklaracja tablic
        int[] wylosowaneLiczby = new int[6];
        int[] liczbyUzytkownika = new int[6];

        // Losowanie 6 różnych liczb z przedziału 1-49
        for (int i = 0; i < 6; i++) {
            int liczba;
            boolean powtorka;

            do {
                liczba = random.nextInt(49) + 1;
                powtorka = false;

                // Sprawdzenie, czy liczba już była wylosowana
                for (int j = 0; j < i; j++) {
                    if (wylosowaneLiczby[j] == liczba) {
                        powtorka = true;
                        break;
                    }
                }
            } while (powtorka);

            wylosowaneLiczby[i] = liczba;
        }

        // Wyświetlenie wylosowanych liczb
        System.out.print("Wylosowane liczby: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(wylosowaneLiczby[i] + " ");
        }
        System.out.println();

        // Wczytanie 6 różnych liczb od użytkownika
        System.out.println("Podaj 6 różnych liczb z przedziału 1-49:");
        for (int i = 0; i < 6; i++) {
            int liczba;
            boolean powtorka;

            do {
                liczba = scanner.nextInt();

                // Sprawdzenie zakresu
                if (liczba < 1 || liczba > 49) {
                    System.out.println("Liczba musi być z zakresu 1-49. Spróbuj ponownie.");
                    powtorka = true;
                    continue;
                }

                // Sprawdzenie, czy liczba już została podana
                powtorka = false;
                for (int j = 0; j < i; j++) {
                    if (liczbyUzytkownika[j] == liczba) {
                        System.out.println("Ta liczba już została podana :(  Wprowadź inną.");
                        powtorka = true;
                        break;
                    }
                }
            } while (powtorka);

            liczbyUzytkownika[i] = liczba;
        }

        // Sprawdzenie, ile liczb się powtarza
        int liczbaTrafien = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (wylosowaneLiczby[i] == liczbyUzytkownika[j]) {
                    liczbaTrafien++;
                    break; // Ta liczba już została policzona
                }
            }
        }

        System.out.println("Liczba trafień : " + liczbaTrafien);

        scanner.close();
    }
}