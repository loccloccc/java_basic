package SS10;

public class EWallet extends PaymentMethod implements Payable {



    private String phoneNumber; //(Số điện thoại liên kết ví).
    private double balance; //(Số dư trong ví).

    public EWallet() {
    }

    public EWallet(String accountName, String paymentId, String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if (balance <amount) {
            System.out.println("So du khong du");
            return;
        }
        balance = balance - amount;
    }

    @Override
    public void validate() {

    }
}
