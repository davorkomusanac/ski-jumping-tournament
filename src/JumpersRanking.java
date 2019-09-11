/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Davor
 */
public class JumpersRanking {
    private List<Jumper> jumpers;
    private PointCalculation points;
    
    public JumpersRanking() {
        jumpers=new ArrayList<Jumper>();
        points=new PointCalculation();
    }
    
    public void addJumper(String name) {
        this.jumpers.add(new Jumper(name));
    }
    
    public void sortJumpers() {
        Collections.sort(jumpers);
    }
    
    public void printJumpers() {
        int i = 1;
        for (Jumper jumper : jumpers) {            
            System.out.println("  " + i + ". " + jumper);            
            i++;
        } 
    }
    
    public void jumpingRound() {
        for (Jumper jumper: jumpers) {
            System.out.println("  " + jumper.getName());
            int jumpLength = points.JumpLength();
            System.out.println("    length: " + jumpLength);
            jumper.addPoints(jumpLength);
            jumper.addJumpLength(jumpLength);           
            System.out.println("    judge votes: " + points.JudgeDecision());
            jumper.addPoints(points.FinalJudgePoints());            
        }
        System.out.println("");
    }
    
    public void finalResults() {
        int i = 1;
        for (Jumper jumper : jumpers) {            
            System.out.println(i+"           " + jumper);     
            System.out.println("            jump lengths: " + jumper.jumpLengths());
            i++;
        } 
    }
    
    public void reverseSortJumpers() {
        Collections.reverse(jumpers);
    }
    
    
}
