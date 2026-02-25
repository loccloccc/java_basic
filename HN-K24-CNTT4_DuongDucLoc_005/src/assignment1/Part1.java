package assignment1;

import java.util.Scanner;

public class Part1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi :");
        String string = sc.nextLine();
        int count = 1;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)){
                    count++;
                    break;
                }
            }
            System.out.println(string.charAt(i)+""+count);
            count = 1;
        }
    }
}
