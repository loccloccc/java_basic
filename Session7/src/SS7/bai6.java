package SS7;

public class bai6 {
    static void main(String[] args) {
        User u1 , u2 , u3 ;
        u1 = new User("loc","1234",1);
        u2 = new User("duy","",2);
        u3 = new User("dung","12341",3);

        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u3.toString());

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        if (UserManager.checkLogin("loc","1234") == true) System.out.println("hop le");
        else System.out.println("khong hop le");

        if (UserManager.checkLogin("Loc","") == true) System.out.println("hop le");
        else System.out.println("khong hop le");
    }
}
