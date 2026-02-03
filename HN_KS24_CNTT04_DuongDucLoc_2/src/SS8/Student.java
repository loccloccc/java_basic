package SS8;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.matches("^SV\\d{3}$")){
            this.id = id;
        }else {
            System.out.println("Ma sinh vien khong hop le");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() != 0){
            this.name = name;
        }else {
            System.out.println("khong duoc de trong");
        }

    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10){
            this.score = score;
        }else{
            System.out.println("Diem khong hop le");
        }
    }

    public String getRank(double score){
        if (score >= 8.0) return  "Gioi";
        else if (score >= 6.5 && score < 8) return "Kha";
        else return "Trung binh";
    }
    public String toString(){
        return "Ma SV : " + this.id + "Ten : " + this.name + "Diem : " + this.score + "Hoc luc : " + getRank(this.score);
    }
}
