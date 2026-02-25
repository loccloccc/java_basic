package assignment2;

import java.util.Scanner;

public class Part1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Mời bạn nhập độ dài mảng :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu : " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Mời bạn nhập  :");
        int k = sc.nextInt();
        for (int i = k ; i > n ; i--) {
            arr[i] = arr[i-1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
