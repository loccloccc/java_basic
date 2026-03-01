package demo;

public class Student {
    private int id;
    private String name;
    private String className;

    public Student() {
    }

    public Student(int id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String toString (){
        return "ma " + id + " Ten " + name + " lop " + className;
    }
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return id == student.id;
    }
}
