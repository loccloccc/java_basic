package SS7;

public class Student {
    private int id;
    private String name;
    private static int score = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        score++;
    }

    public void render(){
        System.out.println("Ma : " + id + " Ten : " + name);
    }

    public static void scoreStudent(){
        System.out.println("so lan : " + score);
    }
}
