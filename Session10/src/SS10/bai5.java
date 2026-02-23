package SS10;

public class bai5 {
    static void main(String[] args) {
        OfficeStaff officeStaff = new OfficeStaff("loc",15000);
        Manager manager = new Manager("duc",15000,5000);
        System.out.println("Ten : " + officeStaff.getName() + " luong : " + officeStaff.calculateSalary());
        System.out.println("Ten : " + manager.getName() + " luong : " + manager.calculateSalary());
    }
}
