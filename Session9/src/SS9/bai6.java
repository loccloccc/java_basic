package SS9;

public class bai6 {

    static void main(String[] args) {
        Shape[] shapes = {new Circle(10), new Rectangle(10, 12), new Circle(5), new Rectangle(4, 7)};
        double sum = 0 ;
        for (int i = 0 ; i < shapes.length ; i++){
            sum += shapes[i].area();
        }
        System.out.printf("%.2f" , sum);
    }
}
