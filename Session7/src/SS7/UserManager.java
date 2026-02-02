package SS7;

import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> users = new ArrayList<>();
    public static void addUser(User u){
        users.add(u);
    }
    public static boolean checkLogin(String username , String pass){
        for (User u : users){
            if (u.getUsername().equals(username) && u.getPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }
}
