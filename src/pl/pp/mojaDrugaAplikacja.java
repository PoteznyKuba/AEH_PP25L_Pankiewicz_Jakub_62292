package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
        public static void main(String[] args) {


            double x=10;
            double y=2;
            Scanner scanner = new Scanner(System.in);

            var result = x+y;
            System.out.println("x+y= " + result);
            result = x-y;
            System.out.println("x-y= " +result);
            result = x*y;
            System.out.println("x*y= " +result);
            result = x/y;
            System.out.println("x/y= " +result);
            result= x%y;
            System.out.println("x%y= " +result);

            System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
            double first= scanner.nextDouble();
            double second= scanner.nextDouble();

            System.out.println("x+y= " + (first + second));
            System.out.println("Teraz zadanie drugie");




            System.out.println("Nasze x wynosi " + x);
            result = 2*x;
            System.out.println("Dwukrotnosc liczby 10 wynosi: " + result);
            result = x*x;
            System.out.println("x^2 wynosi: " + result);

            System.out.println("Teraz 2 podpunkt zadania 2");
            System.out.println("Wpisz swój wiek w latach: ");
            //Zmienilem double na long zeby pokazywalo całą wartość
            double Wiek= scanner.nextDouble();
            result=Wiek*12614400;
            System.out.println("Twój wiek to " +Wiek +",a w sekundach wynosi on: " +result + " przeżytych sekund");

         }










}


