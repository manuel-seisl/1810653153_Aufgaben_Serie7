package Aufgabe4;

import sun.jvm.hotspot.debugger.cdbg.TemplateType;

import javax.swing.*;

public class Main
{

    public static void main(String[] args){

        String text = JOptionPane.showInputDialog("Geben Sie einen Text mit mindestens 10 Zeichen ein:");

        try {

            checkTextLength(text);

            System.out.println("Der eingegebene Text ist:");
            System.out.println(text);

        } catch(TextLengthException tex){
            tex.printStackTrace();
        }


    }

    public static void checkTextLength(String text) throws TextLengthException {

        if (text.length() < 10){
            throw new TextLengthException();
        }

    }

}
