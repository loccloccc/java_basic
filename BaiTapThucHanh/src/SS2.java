import java.util.Scanner;

public class SS2 {
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("----- MENU ------");
        System.out.println("1 . Tinh tien phat tra sach.");
        System.out.println("2 . Dang ki the muon VIP .");
        System.out.println("3 . Thong ke sach nhap kho .");
        System.out.println("0 . Thoat .");
    }
    public static void main(String[] args) {
        int choice ;
        do {
            menu();
            System.out.print("Lua chon cua ban : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap so luong sach doc gia tra : ");
                    int quantity = sc.nextInt();
                    float totalMoney = 0F;
                    int day;
                    for (int i = 0 ; i < quantity ; i++){
                        System.out.println("nhap so ngay qua han sach thu " + (i + 1));
                        day = sc.nextInt();
                        if(day >= 1 && day <= 5) totalMoney+= 2000;
                        else totalMoney+=5000;
                    }
                    System.out.println("Tong tien phat la : " + totalMoney);
                    break;
                case 2:
                    int age , quantityBook ;
                    System.out.println("Nhap so tuoi :");
                    age = sc.nextInt();
                    System.out.println("Nhap so sach da muon :");
                    quantityBook = sc.nextInt();
                    if (age>= 18 && quantityBook >= 10) System.out.println("Đủ tiêu chuẩn nâng cấp VIP");
                    else System.out.println("Chưa đủ tiêu chuẩn");
                    break;
                case 3 :
                    int count = 0 ;
                    int id;
                    while (true){
                        System.out.println("Nhap id");
                        id = sc.nextInt();
                        if (id <= 0) {
                            System.out.println("Nhap lai...");
                            continue;
                        }else {
                            count++;
                        }
                        if (id==0) break;
                    };
                    System.out.println(count);
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("khong co lua chon  nay");
            }
        }while (choice != 0);

    }
}
