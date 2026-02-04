package SS9;

import java.util.Scanner;

public class Student extends Person{
    private String idStu;
    private double score;

    public Student() {
        super();
    }

    public Student(String fullname, int age, String idStu, double score) {
        super(fullname, age);
        this.idStu = idStu;
        this.score = score;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        super.input();

        do {
            System.out.println("Moi ban nhap ma sinh vien : ");
            idStu = sc.nextLine();
            if (!idStu.matches("^SV\\d{3}")) System.out.println("Loi !!!!");
        }while (!idStu.matches("^SV\\d{3}"));

        do {
            System.out.println("Moi ban nhap diem : ");
            score = sc.nextDouble();
            if (score < 0 && score > 10) System.out.println("Loi !!!!");
        }while (score < 0 && score > 10);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ma : " + idStu + " Diem : " + score);
    }
}
