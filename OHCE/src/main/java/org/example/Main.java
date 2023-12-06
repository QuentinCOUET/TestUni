package org.example;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String language = "en";

        java.util.GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.get(Calendar.HOUR_OF_DAY) > 2 && calendar.get(Calendar.HOUR_OF_DAY) < 18) {
            if (language == "fr") {
                System.out.println("Bonjour");
            }
            if (language == "en") {
                System.out.println("good morning");
            }
        } else {
            if (language == "fr") {
                System.out.println("Bonsoir");
            } else if (language == "en") {
                System.out.println("good afternoon");
            }
        }

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String str = myObj.nextLine();  // Read user input

        if (pal(str)) {
            if (language == "fr") {
                System.out.println("Bien dit !");
            } else if (language == "en") {
                System.out.println("well said !");
            }
        } else {
            StringBuilder sb = new StringBuilder();

            // ajouter la chaîne dans StringBuilder
            sb.append(str);

            sb = sb.reverse();

            // afficher la chaîne inversée
            System.out.println(sb);
        }


        if (calendar.get(Calendar.HOUR_OF_DAY) > 21 && calendar.get(Calendar.HOUR_OF_DAY) < 4) {
            if (language == "fr") {
                System.out.println("bonne nuit");
            }
            if (language == "en") {
                System.out.println("good night");
            }
        } else {
            if (language == "fr") {
                System.out.println("Au revoir");
            } else if (language == "en") {
                System.out.println("good bye");
            }
        }
    }

    public static boolean pal(String mot) {
        int i = 0, longueur = mot.length() - 1;
        boolean egale = true;
        /*tester le premier caractère avec le dernier
         *et s'ils sont égaux, le programme continu
         *à dérouler la boucle while et tester
         *le caractère suivant(i+1 avec longeur-(i+1))
         *jusqu'à i soit égale à longueur/2,
         *, sinon le booléen egale reçoit false
         *donc, la fonction pal retourne false
         */
        while (i < longueur / 2 && egale) {
            if (mot.charAt(i) == mot.charAt(longueur - i))
                egale = true;
            else
                egale = false;
            i++;
        }
        return egale;
    }
}