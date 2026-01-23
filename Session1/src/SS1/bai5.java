package SS1;

import java.util.Scanner;

public class bai5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tự nhiên có 4 chữ số : ");
        int number = sc.nextInt();
        int units = number % 10 ;
        int dozens = (number / 10 ) % 10 ;
        int  hundreds = (number / 100 ) % 10 ;
        int thousands = number / 1000;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        if(sumOfFirstThreeNumber % 10 == units){
            System.out.print("TRUE");
        } else{
            System.out.print("FALSE");
        }
    }
}
