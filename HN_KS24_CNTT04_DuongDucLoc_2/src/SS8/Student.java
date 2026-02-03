package SS8;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {}

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void setId(String id) {
        if (id.matches("^SV\\d{3}$")) {
            this.id = id;
        } else {
            System.out.println("Ma sinh vien khong hop le");
        }
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Khong duoc de trong");
        }
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Diem khong hop le");
        }
    }

    public String getRank() {
        if (score >= 8) return "Gioi";
        else if (score >= 6.5) return "Kha";
        else return "Trung binh";
    }

    @Override
    public String toString() {
        return "Ma SV: " + id +
                " Ten: " + name +
                " Diem: " + score +
                " Hoc luc: " + getRank();
    }
}
