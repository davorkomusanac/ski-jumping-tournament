/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Davor
 */
public class PointCalculation {
    ArrayList<Integer> judgePoints;
    private Random random = new Random();
    
    public int JumpLength() {
        return 60 + random.nextInt(61);
    }
    
    public ArrayList<Integer> JudgeDecision() {
        this.judgePoints = new ArrayList<Integer>();
        for (int i=0; i<5; i++) {
            int points = 10 + random.nextInt(11);            
            judgePoints.add(points);
        }        
        return judgePoints;        
    }
    
    public int FinalJudgePoints() {
        Collections.sort(judgePoints);
        int points = 0;
        for (int i=1; i<4; i++) {
            points+=this.judgePoints.get(i);
        }
        return points;
    }
    
}
