package SS10;

public abstract class Employee {
    private String name;
    private  double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    protected Employee() {
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public abstract double calculateSalary();
}
