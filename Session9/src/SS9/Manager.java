package SS9;

public class Manager extends  Employee{
    private String department;

    public Manager() {
        super();
    }

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phong ban : " + department);
    }
}
