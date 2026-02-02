package SS7;

public class bai3 {
    static void main(String[] args) {
        double[] score;
        score = new double[]{6.5, 8.0, 4.5};
        double total =  ScoreUtils.calculateAverage(score);
        System.out.printf("Diem trung binh : " + total);
        System.out.println("");
        for (int i = 0 ; i < score.length ; i++){
            if (ScoreUtils.checkPass(score[i]) == true){
                System.out.println(score[i] + " : Dat");
            }else {
                System.out.println(score[i] + " : Truot");
            }
        }

    }
}
