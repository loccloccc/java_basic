package SS6;



public class bai1 {
    static void main(String[] args) {
        Student st1 , st2 , st3;
        st1 = new Student("ST01","Duong Duc Loc",2006 , 9.9F);
        st2 = new Student("ST02","Doan Ngoc Duy",2006 , 9.9F);
        st3 = new Student("ST03","Nguyen Tien Minh",2006 , 10.0F);

        System.out.println("Ma SV : " + st1.getIdStu());
        System.out.println("Ten SV : " + st1.getFullName());
        System.out.println("Nam sinh : " + st1.getYearBirth());
        System.out.println("Diem trung binh : " + st1.getAvgScore());

        System.out.println("Ma SV : " + st2.getIdStu());
        System.out.println("Ten SV : " + st2.getFullName());
        System.out.println("Nam sinh : " + st2.getYearBirth());
        System.out.println("Diem trung binh : " + st2.getAvgScore());

        System.out.println("Ma SV : " + st3.getIdStu());
        System.out.println("Ten SV : " + st3.getFullName());
        System.out.println("Nam sinh : " + st3.getYearBirth());
        System.out.println("Diem trung binh : " + st3.getAvgScore());

    }
}
