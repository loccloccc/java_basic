package SS9;

import java.util.Scanner;

public class Person {
    private String fullname;
    private int age;

    public Person() {
    }

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten :");
        fullname = sc.nextLine();
        System.out.println("Nhap tuoi :");
        age = sc.nextInt();
    }
    public void display(){
        System.out.println("Ten : " + fullname + " . Tuoi : " + age);
    }
}
