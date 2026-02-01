package SS6;



public class Student {
    private String idStu;
    private String fullName;
    private int yearBirth;
    private float avgScore;


    public Student(String idStu, String fullName, int yearBirth, float avgScore) {
        this.idStu = idStu;
        this.fullName = fullName;
        this.yearBirth = yearBirth;
        this.avgScore = avgScore;
    }

    public String getIdStu() {
        return idStu;
    }

    public void setIdStu(String idStu) {
        this.idStu = idStu;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

}
