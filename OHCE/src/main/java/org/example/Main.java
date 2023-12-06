package org.example;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lang = "en";
        java.util.GregorianCalendar calendar = new GregorianCalendar();

        starting(lang, calendar);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String str = myObj.nextLine();  // Read user input

        if (pal(str)) {
            if (lang == "fr") {
                System.out.println("Bien dit !");
            } else if (lang == "en") {
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


        ending(lang, calendar);
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

    public static String starting(String lang, java.util.GregorianCalendar calendar) {
        if (calendar.get(Calendar.HOUR_OF_DAY) > 2 && calendar.get(Calendar.HOUR_OF_DAY) < 18) {
            if (lang == "fr") {
                System.out.println("Bonjour");
                return "Bonjour";
            }
            if (lang == "en") {
                System.out.println("good morning");
                return "good morning";
            }
        } else {
            if (lang == "fr") {
                System.out.println("Bonsoir");
                return "Bonsoir";
            } else if (lang == "en") {
                System.out.println("good afternoon");
                return "good afternoon";
            }
        }
        return "";
    }

    public static String ending(String lang, java.util.GregorianCalendar calendar) {
        if (calendar.get(Calendar.HOUR_OF_DAY) > 4 && calendar.get(Calendar.HOUR_OF_DAY) < 21) {
            if (lang == "fr") {
                System.out.println("Au revoir");
                return "Au revoir";
            } else if (lang == "en") {
                System.out.println("good bye");
                return "good bye";
            }
        } else {
            if (lang == "fr") {
                System.out.println("bonne nuit");
                return "bonne nuit";
            }
            if (lang == "en") {
                System.out.println("good night");
                return "good night";
            }
        }
        return "";
    }
}
