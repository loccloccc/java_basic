package BTTH;

import java.util.Scanner;

public class bai1 {
    static void main(String[] args) {
//        int[] arr = new int[100];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap do dai mang : ");
//        int n = sc.nextInt();
//        System.out.println("nhap gia tri mang : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr1 = {1,2,2,4,6};
        int[] arr2 = {2,3,5};
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    flag = true;
                    break;
                }
            }
            if (flag==false) System.out.println(arr1[i]);
        }
    }
}
