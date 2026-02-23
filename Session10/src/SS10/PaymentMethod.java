package SS10;

public abstract class PaymentMethod {
    protected String accountName; //(Tên chủ tài khoản).
    protected String paymentId; //(Mã định danh phương thức thanh toán).

    public PaymentMethod() {
    }

    public PaymentMethod(String accountName, String paymentId) {
        this.accountName = accountName;
        this.paymentId = paymentId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public abstract void validate();
}
