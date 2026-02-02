package SS7;

import java.util.Scanner;

public class ScoreUtils {
    private double score;

    public ScoreUtils(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    static Scanner sc = new Scanner(System.in);

    public  static boolean checkPass(double score){
        if (score >= 5.0) return true;
        return false;
    }

    public static  double calculateAverage(double[] scores){
        double sum = 0F;
        for (int i = 0 ; i < scores.length ; i++){
            sum += scores[i];
        }
        return sum/(scores.length);
    }
}
