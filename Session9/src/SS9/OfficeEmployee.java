package SS9;

public class OfficeEmployee extends Employee{
    public OfficeEmployee() {
        super();
    }

    public OfficeEmployee(String name, int salary ) {
        super(name, salary);
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }
}
