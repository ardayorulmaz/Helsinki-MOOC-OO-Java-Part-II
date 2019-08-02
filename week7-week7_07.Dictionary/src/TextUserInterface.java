/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        statements();

        while (true) {
            System.out.println("Statement:");

            String input = reader.nextLine().trim();

            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            }
            System.out.println("Unknown Statement");
        }
    }

    public void add() {
        System.out.println("In Finnish:");
        String finnish = reader.nextLine().trim();
        System.out.println("Translation:");
        String translation = this.reader.nextLine();

        this.dictionary.add(finnish, translation);
    }

    public void translate() {
        System.out.println("Give a word:");
        String translateword = reader.nextLine().trim();
        
        System.out.println(this.dictionary.translate(translateword));
    }

    public void statements() {
        System.out.println("Statements:");
        System.out.println(" add - adds a word pair to the dictionary");
        System.out.println(" translate - asks a word and prints its translation");
        System.out.println(" quit - quits the text user interface");

    }

}
