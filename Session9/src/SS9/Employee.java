package SS9;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public void display(){
        System.out.println("Ten : " + name + " Luong " + salary);
    }

    public int calculateSalary(){
        return salary;
    }
}
