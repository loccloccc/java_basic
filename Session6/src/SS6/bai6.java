package SS6;

public class bai6 {
    static void main(String[] args) {
        User u1 , u2;
        u1 = new User(1,null ,"","agmail.com");
        u2 = new User(2 , "duc" , "1234" , "duc@gmail.com");
        u1.render();
        u2.render();
    }
}
