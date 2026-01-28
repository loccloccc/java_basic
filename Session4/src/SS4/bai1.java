package SS4;

public class bai1 {
    static void main(String[] args) {
        String title = "     lap TRINH java      co Ban  ";
        String author = "nguyen van a";
        title = title.trim().replaceAll("\\s+" , " ").toUpperCase();
        System.out.print("[ " + title + " ] - Tac gia : ");
        String[] arr = author.trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase());
        }
    }
}


