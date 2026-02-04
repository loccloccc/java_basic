package SS9;

public class ProductionEmployee extends Employee{
    public ProductionEmployee() {
        super();
    }
    public ProductionEmployee(String name, int salary) {
        super(name, salary);

    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }
}
