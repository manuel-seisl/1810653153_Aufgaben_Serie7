package Aufgabe2;

import javax.swing.*;

public class Main
{

    public static void main(String[] args) {

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte erste Zahl eingeben:"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte zweite Zahl eingeben:"));

        try {
            System.out.println("Das Ergebnis beträgt: " + (zahl1 / zahl2));
        } catch (ArithmeticException ex){
            System.out.println("Division durch 0 nicht zulässig!");
        }

    }


}
