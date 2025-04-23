package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja{
            public static void main(String[] args) {

                Scanner scanner=new Scanner(System.in);

                while (true){
                    System.out.print("Podaj dolną granice przedziału: ");
                    int dolna=scanner.nextInt();

                    System.out.print("Podaj górną granice przedziału: ");
                    int górna=scanner.nextInt();

                    if (górna<=dolna) {
                        System.out.println("Koniec programu.");
                        break;
                    }

                    int suma =0;

                    for (int zero=dolna; zero<= górna; zero++) {
                        suma+=zero*zero;
                    }

                    System.out.println("Suma kwadratów liczb w przedziale od "+dolna+" do "+górna+" wynosi: " + suma);
                }

                System.out.println("Teraz idziemy do kalkulatora");
                while (true){
                    System.out.println("Podaj pierwszą liczbe: ");
                    String pierwszaSTR=scanner.nextLine();
                    if(pierwszaSTR.isEmpty()){
                        System.out.println("Musisz podać jakąś liczbę.");
                        continue;
                    }
                    int pierwsza=Integer.parseInt(pierwszaSTR);

                    System.out.println("  ");

                    System.out.println("Podaj drugą liczbe: ");
                    String drugaSTR=scanner.nextLine();
                    if(drugaSTR.isEmpty()) {
                        System.out.println("Musisz podać jakąś liczbę.");
                        continue;
                    }
                    int druga=Integer.parseInt(drugaSTR);

                    System.out.println("Co chcesz z nimi zrobić? (napisz liczbę)");
                    System.out.println("   ");
                    System.out.println("1. Dodać");
                    System.out.println("2. Odjąć");
                    System.out.println("3. Pomnożyć");
                    System.out.println("4. Podzielić");

                    int suma=0;
                    int wybór= scanner.nextInt();
                    if (wybór==1) {
                        suma=pierwsza+druga;
                        System.out.println("Wynik dodawania twoich dwóch liczb to: "+suma);
                    }
                    else if (wybór==2){
                        suma=pierwsza-druga;
                        System.out.println("Wynik odejmowania twoich dwóch liczb to: "+suma);
                    }
                    else if (wybór==3){
                        suma=pierwsza*druga;
                        System.out.println("Wynik mnożenia twoich dwóch liczb to: "+suma);
                    }
                    else if (wybór==4){
                        if(druga==0){
                            System.out.println("Ciekawe czy Profesor spróbował podzielić przez zero??");
                            return;
                        }
                        suma=pierwsza/druga;
                        System.out.println("wynik dzielenia twoich dwóch liczb to: "+suma);
                    }
                    else if (wybór>=5){
                        System.out.println("Podaj liczby jeszcze raz i wybierz liczby od 1 do 4.");
                    }
                    else if (wybór<=1){
                        System.out.println("Podaj liczby jeszcze raz i wybierz liczby od 1 do 4.");
                    }
                }
            }
}






