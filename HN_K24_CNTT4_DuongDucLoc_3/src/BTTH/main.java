package BTTH;

import java.util.List;

public class main {
    static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee(1 , "Bạc sỉu" , 30000 , true);
        drinks[1] = new FruitJuice(1 , "Nước cam" , 40000 , 10);
        drinks[2] = null;
        for (int i = 0 ; i < drinks.length ; i++){
            if (drinks[i] == null) continue;
            drinks[i].displayInfo();
            System.out.println("gia thanh tien : " + drinks[i].calculatePrice());
            if (drinks[i] instanceof IMixable){
                ((IMixable) drinks[i]).mix();
            }
        }
    }
}
