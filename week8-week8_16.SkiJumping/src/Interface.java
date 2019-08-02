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
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class Interface {

    private Scanner reader;
    private ArrayList<Jumper> jumpers;

    private int roundno;

    public Interface() {
        this.reader = new Scanner(System.in);
        this.jumpers = new ArrayList<Jumper>();
       this.roundno = 1;
    }
    

    public void initialize() {

        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.println("  Participant name:");
            String input = this.reader.nextLine();
            if (input.equals("")) {
                break;
            } else {
                this.jumpers.add(new Jumper(input, 0));
            }

        }

        System.out.println("The tournament begins!\n");
        System.out.println("Write \"jump\" to jump; otherwise you quit:");

        while (true) {
            String newinput = reader.nextLine();
            if (newinput.equals("quit")) {
                break;

            } else if (newinput.equals("jump")) {

                this.jumpRound();
            }
            System.out.println("Write \"jump\" to jump; otherwise you quit:");
        }
    }

    public void jumpRound() {
        

        System.out.println("Round " + this.roundno);
        System.out.println();
        System.out.println("Jumping order:");
        Collections.sort(jumpers);
        for (int i = 0; i < jumpers.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + jumpers.get(i).toString());
        }
        System.out.println("Results of round " + this.roundno);
        for (Jumper jumper : jumpers) {
            jump(jumper);
        }
        this.roundno++;
    }

    public void results() {
        System.out.println("Thanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        for (Jumper jumper : jumpers) {
            System.out.println((this.jumpers.lastIndexOf(jumper) + 1) + "           " + jumper.getName() + " (" + jumper.getPoint() + " points)");
            System.out.println("             jump lengths: " + jumper.jumplist());
        }
    }

    public void jump(Jumper jumper) {

        Random random = new Random();
        int length = random.nextInt(61) + 60;
        jumper.addJump(length);
        ArrayList<Integer> judgevotes = new ArrayList<Integer>();

        for (int x = 0; x < 5; x++) {
            judgevotes.add(random.nextInt(11) + 10);
        }

        System.out.println("  " + jumper.getName());
        System.out.println("    length: " + length);
        System.out.println("    judge votes: [" + judgevotes.get(0) + ", " + judgevotes.get(1) + ", " + judgevotes.get(2) + ", " + judgevotes.get(3) + ", " + judgevotes.get(4) + "]");
        Collections.sort(judgevotes);
        int judgeaverage = judgevotes.get(1) + judgevotes.get(2) + judgevotes.get(3);

        jumper.setPoint(jumper.getPoint() + length + judgeaverage);
    }
}
