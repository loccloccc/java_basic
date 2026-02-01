package SS6;

public class bai4 {
    static void main(String[] args) {
        Employee e1 , e2 ,e3;
        e1 = new Employee();
        e2 = new Employee("loc" , 1);
        e3 = new Employee(1,"loc"  , 120f);
        e1.render();
        e2.render();
        e3.render();
    }
}
