package SS9;

public class bai5 {
    static void main(String[] args) {
        Employee[] emp = {new OfficeEmployee("Loc", 12000), new ProductionEmployee("Duy" , 10000) , new OfficeEmployee("Loc2", 15000)};
        double totalSalary = 0.0 ;
        for (int i = 0 ; i < emp.length ; i++){
            totalSalary+= emp[i].calculateSalary();
        }
        System.out.println(totalSalary);
    }
}
