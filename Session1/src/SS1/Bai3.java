package SS1;

public class Bai3 {
    static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Truoc khi hoan doi : Book1 = " + book1 + " Book2 = " + book2);

        String temp = book1;
        book1 = book2;
        book2 = temp ;

        System.out.println("Sau khi hoan doi : Book1 = " + book1 + " Book2 = " + book2);
        // `book1`, `book2`, `temp` là biến tham chiếu, nằm trên Stack
        //  Các chuỗi `"Java Basic"` và `"Python Intro"` là đối tượng String, nằm trên Heap
        //  Khi gán `temp = book1` → `temp` chỉ trỏ cùng địa chỉ với `book1`, không tạo chuỗi mới
        // Khi hoán đổi, chỉ thay đổi địa chỉ trên Stack, nội dung Heap không thay đổi
        //* String là immutable, nên dữ liệu chuỗi không bị sửa, chỉ đổi biến trỏ tới đâu

    }
}
