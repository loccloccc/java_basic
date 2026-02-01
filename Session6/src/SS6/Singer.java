package SS6;

import java.util.Date;

public class Singer {
    private int id;
    private String name;
    private String gender;
    private Date birthDay;
    private String hometown;
    private String careerStartYear;
    private  String field;

    public Singer(int id, String name, String gender, Date birthDay, String hometown, String careerStartYear, String field) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.hometown = hometown;
        this.careerStartYear = careerStartYear;
        this.field = field;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getCareerStartYear() {
        return careerStartYear;
    }

    public void setCareerStartYear(String careerStartYear) {
        this.careerStartYear = careerStartYear;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void render(){
        System.out.println("---- Hien thi thong tin ----");
        System.out.println("Ma : " + this.id);
        System.out.println("Ho va ten : " + this.name);
        System.out.println("Gioi tinh : " + this.gender);
        System.out.println("Ngay sinh : " + this.birthDay);
        System.out.println("Que quan : " + this.hometown);
        System.out.println("Nam bat dau su nghiep : " + this.careerStartYear);
        System.out.println("Linh vuc : " + this.field);
    }
}
