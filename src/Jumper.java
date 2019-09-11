/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Davor
 */
public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points;
    private List<Integer> jumpLengths;
    
    public Jumper(String name) {
        this.name=name;
        this.points=0;
        this.jumpLengths = new ArrayList<Integer>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public void addPoints(int points) {
        this.points+=points;
    }
        
    public void addJumpLength(int length) {
        this.jumpLengths.add(length);
    }
    
    public String jumpLengths() {
        String lengths = "";
        for(int i=0; i<jumpLengths.size()-1; i++) {
            lengths += jumpLengths.get(i) + " m, ";
        }
        lengths += jumpLengths.get(jumpLengths.size()-1) + " m";
        return lengths;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
    
    @Override
    public int compareTo(Jumper jumper) {
        return this.points-jumper.getPoints();
    }
    
}
