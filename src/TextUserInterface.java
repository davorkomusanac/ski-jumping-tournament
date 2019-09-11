/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Davor
 */
public class TextUserInterface {

    private Scanner command;
    private JumpersRanking jumpers = new JumpersRanking();

    public TextUserInterface(Scanner command) {
        this.command = command;
    }

    public void start() {
        this.AddingJumpers();
        this.JumpingPhase();
        this.TournamentResults();
    }

    public void AddingJumpers() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String newCommand = command.nextLine();
            if (newCommand.equals("")) {
                break;
            }
            jumpers.addJumper(newCommand);
        }       
    }

    public void JumpingPhase() {
        System.out.println("\nThe tournament begins!\n" + "\n");
        int i = 1;
        
        while (true) {            
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String newCommand = command.nextLine();
            if (!newCommand.equals("jump")) {
                break;
            }            
            System.out.println("\n" + "Round " + i + "\n" + "\n" + "Jumping order:");
            jumpers.sortJumpers();;
            jumpers.printJumpers();
            System.out.println();
            System.out.println("Results of round " + i);
            i++;
            jumpers.jumpingRound();
        }
    }
    
    public void TournamentResults() {
        System.out.println("\nThanks!\n" + "\n" + "Tournament results:\n" + "Position    Name");
        jumpers.sortJumpers();
        jumpers.reverseSortJumpers();
        jumpers.finalResults();
    }
}
