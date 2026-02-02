package SS7;

public class bai1 {
    static void main(String[] args) {
        Student s1 , s2;
        s1 = new Student(1,"loc");
        s2 = new Student(2,"duy");

        s1.render();
        s2.render();

        Student.scoreStudent();
    }
}
