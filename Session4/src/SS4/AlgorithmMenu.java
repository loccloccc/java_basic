package SS4;

import java.util.*;
import java.util.regex.*;

public class AlgorithmMenu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // xóa buffer

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Thoát chương trình 👋");
                    return;
                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }

            System.out.println("\n-----------------------------\n");
        }
    }

    // ===== MENU =====
    static void showMenu() {
        System.out.println("===== MENU THUẬT TOÁN =====");
        System.out.println("1. Two Sum (Tìm cặp số có tổng bằng K)");
        System.out.println("2. Move Zeroes (Dồn số 0 về cuối)");
        System.out.println("3. Valid Palindrome (Chuỗi đối xứng)");
        System.out.println("4. Reverse Words (Đảo ngược từ)");
        System.out.println("5. Happy Number (Số hạnh phúc)");
        System.out.println("0. Thoát");
        System.out.print("👉 Nhập lựa chọn: ");
    }

    // =====================================================
    // FR1: TWO SUM
    // =====================================================
    static void twoSum() {
        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập target: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("✔ Tìm thấy: i = " + i + ", j = " + j);
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("❌ Không tìm thấy cặp số phù hợp");
        }
    }

    // =====================================================
    // FR2: MOVE ZEROES (KHÔNG DÙNG MẢNG PHỤ)
    // =====================================================
    static void moveZeroes() {
        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Mảng sau khi dồn số 0:");
        System.out.println(Arrays.toString(arr));
    }

    // =====================================================
    // FR3: VALID PALINDROME (REGEX)
    // =====================================================
    static void validPalindrome() {
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        String cleaned = input
                .replaceAll("[^a-zA-Z]", "")
                .toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Kết quả: " + isPalindrome);
    }

    // =====================================================
    // FR4: REVERSE WORDS
    // =====================================================
    static void reverseWords() {
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" ");
        }

        System.out.println("Chuỗi sau xử lý:");
        System.out.println(result.toString());
    }

    // =====================================================
    // FR5: HAPPY NUMBER (KHÔNG DÙNG SET – FLOYD)
    // =====================================================
    static void happyNumber() {
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        if (slow == 1) {
            System.out.println("✔ Đây là số hạnh phúc");
        } else {
            System.out.println("❌ Đây KHÔNG phải số hạnh phúc");
        }
    }

    static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

