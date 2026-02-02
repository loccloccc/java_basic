package SS7;

public class User {
    private final int id;
    private String username;
    private String password;

    public User(String username, String password , int id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }
    public String toString(){
        return "User { id = " + id + " username :" + username + " password " + password +"}";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
