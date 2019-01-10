package Aufgabe3;

import javax.swing.*;

public class Main
{

    public static void main(String[] args) {

        try {

            int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte erste Zahl eingeben:"));
            int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte zweite Zahl eingeben:"));

            System.out.println("Das Ergebnis beträgt: " + (zahl1 / zahl2));

        } catch (NumberFormatException nfex){
            System.out.println("Eingabe war kein Integer-Wert!");
        } catch (ArithmeticException aex){
            System.out.println("Division durch 0 nicht zulässig!");
        } catch (NullPointerException npex){
            System.out.println("Kein Objekt verfügbar!");
        }

    }


}
