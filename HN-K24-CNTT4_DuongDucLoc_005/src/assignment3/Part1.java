package assignment3;

import java.util.Scanner;

public class Part1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Mời bạn nhập độ dài mảng :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu : " + (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Mời bạn nhập số nguyên :");
        int k = sc.nextInt();
        int sum = 0;
        int count = 0;
        int[] arr2 = new int[100];
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            if (arr[i] < arr[i+1]){
                sum+=arr[i];
                flag = true;
            }
            if (flag==true){
                arr2[count] = arr[i];
                count++;
            }
        }
        if (sum==k) System.out.println("["+arr2[0]+","+arr2[count -1]+"]");
        else System.out.println("-1");
    }
}
