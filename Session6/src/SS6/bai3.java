package SS6;

public class bai3 {
    static void main(String[] args) {
        Products p1 , p2;
        p1 = new Products(1,"Sua bo" , 12000f);
        p2 = new Products(2,"Sua chua" , -12000f);

        p1.render();
        p2.render();
    }
    // neu sai dieu kien thi no se thong bao loi va ghi gia la 0
}
