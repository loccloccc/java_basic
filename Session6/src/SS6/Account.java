package SS6;

public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showAcount(){
        System.out.println("--- Thong tin ca nhan ----");
        System.out.println("User : " + this.username + "\nPass : ********* \n Email :" + this.email);
    }
}
