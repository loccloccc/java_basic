package SS7;

public class bai2 {
    static class Student {
        String name;

        public Student(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {


        int a = 10;
        int b = a;  // sao chep gia tri

        b = 20;


        System.out.println("a = " + a);
        System.out.println("b = " + b);




        Student s1 = new Student("Loc");
        Student s2 = s1; // sao chep dia chi

        s2.name = "Duy";


        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
