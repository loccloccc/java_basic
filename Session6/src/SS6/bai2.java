package SS6;

import java.util.Scanner;

public class bai2 {


    static void main(String[] args) {
        Account ac1 = new Account("Loc" , "loc1234" ,"loc123@gmail.com");
        ac1.showAcount();
        String newPass;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap pass moi : ");
        newPass = sc.nextLine();
        if (!ac1.getPassword().equals(newPass)){
            ac1.setPassword(newPass);
            System.out.println("Sua mat khau thanh cong");
            ac1.showAcount();
        }else {
            System.out.println("Sua mat khau that bai");
        }
    }
}
