package SS10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard extends  PaymentMethod  implements  Payable{
    private String cardNumber; //(Số thẻ tín dụng - yêu cầu kiểm tra $16$ chữ số).
    private String cvv; //(Mã bảo mật).
    private double creditLimit; //(Hạn mức tín dụng).

    public CreditCard() {
    }

    public CreditCard(String accountName, String paymentId, String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void pay(double amount) {
        creditLimit = creditLimit - amount;
    }

    @Override
    public void validate() {
        Pattern p = Pattern.compile(("^\\d{16}$"));
        Matcher m;
        m = p.matcher(cardNumber);
        if (!m.find()){
            System.out.println("So the tin dung khong hop le");
        }else {
            System.out.println("so the tin dungj khong hop le");
        }
    }
}
