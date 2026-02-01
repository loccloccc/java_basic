package SS6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class User {
    private int id ;
    private String userName ;
    private  String password ;
    private  String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        Pattern p = Pattern.compile("^[a-zA-Z][\\w_$.]*[@]\\w{3,}[.]\\w{2,5}([.]\\w{2,5})?$");
        Matcher m = p.matcher(userName);
        if (m.find()){
            this.userName = userName;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() != 0){
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void render(){
        System.out.println("ma " + this.id + "ten " + this.userName + "pass : " + this.password + "email : " + this.email);
    }
}
