package Aufgabe1;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte erste Zahl eingeben:"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte zweite Zahl eingeben:"));
        int erg = 0;

        if (zahl2 == 0){
            System.err.println("Division durch 0");
            return;
        } else {
            erg = zahl1 / zahl2;
        }

        System.out.println(erg);

    }

}
