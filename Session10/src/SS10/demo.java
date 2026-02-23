package SS10;

public class demo {
    static void main(String[] args) {
        CreditCard cc = new CreditCard("loc","P001","1234567891234567","111111",5.5);
        EWallet wallet = new EWallet("loc","P001","0123456789",1.1);

        Payable payable = new Payable() {
            @Override
            public void pay(double amount) {
                if (amount>=1000000){
                    System.out.println("ban co 100 diem thuong");
                }else {
                    System.out.println("ban co 10 diem thuong");
                }
                System.out.println("ban da thanh toan thanh cong");
            }
        };
        System.out.println("thanh toan hang hoa");
        cc.pay(1000000);
        payable.pay(2000000);
    }
}
