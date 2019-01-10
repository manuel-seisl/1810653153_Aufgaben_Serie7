package Aufgabe4;

public class TextLengthException extends Exception
{

    public TextLengthException(){
        super("Die Textlänge ist kleiner als 10 Zeichen!");
    }

}
