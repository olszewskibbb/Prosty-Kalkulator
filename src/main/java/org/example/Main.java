package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double liczba1;
        char dzialanie;
        double liczba2;

        System.out.println("Oto prosty kalkulator, ktory pozwala na: ");
        System.out.println("Dodawanie, odejmowanie, mnozenie i dzielenie.");

        System.out.println("Podaj pierwsza liczbe: ");
        liczba1 = scanner.nextDouble();

        System.out.println("Jakie dzialanie chcesz wykonac? ( Podaj operator: +, -, *, / ) : ");
        dzialanie = scanner.next().charAt(0);

        System.out.println("Podaj druga liczbe: ");
        liczba2 = scanner.nextDouble();

        double wynik;
        switch(dzialanie) {
            case '+':
                wynik = dodawanie(liczba1, liczba2);
                break;
            case '-':
                wynik = odejmowanie(liczba1, liczba2);
                break;
            case '*':
                wynik = mnozenie(liczba1, liczba2);
                break;
            case '/':
                wynik = dzielenie(liczba1, liczba2);
                break;
            default:
                System.out.println("Niepoprawny operator");
                return;
        }

        System.out.println("Wynik: " + wynik);
    }

    public static double dodawanie(double a, double b) {
        return a + b;
    }

    public static double odejmowanie(double a, double b) {
        return a - b;
    }

    public static double mnozenie(double a, double b) {
        return a * b;
    }

    public static double dzielenie(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Nie mozna dzielic przez zero");
            return 0;
        }
    }
}