package assignment2;

import java.util.Scanner;

public class Part2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Mời bạn nhập độ dài mảng :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu : " + (i+1));
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int max = -9999;
        for (int i = 0 ; i < n ; i++){
            for (int j = i+1; j < n; j++) {
                if ((arr[i] + arr[j] == 1 || arr[i] - arr[j] == 1) && max > sum){
                    sum = arr[i] + arr[j];
                }
            }
            max = sum;
        }
        System.out.println(max);
    }
}
