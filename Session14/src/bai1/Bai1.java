package bai1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bai1 {
    static class Info{
        private String name;
        private String address;

        public Info() {}

        public Info(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " - " + address;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Info info = (Info) o;
            return Objects.equals(name, info.name) && Objects.equals(address, info.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, address);
        }
    }
    static void main(String[] args) {
        Set<Info> stringSet = new HashSet<>();
        stringSet.add(new Info("Nguyễn Văn A","Yên Bái"));
        stringSet.add(new Info("Trần Thị B","Thái Bình"));
        stringSet.add(new Info("Nguyễn Văn A","Yên Bái"));
        stringSet.add(new Info("Lê Văn C","Hưng Yên"));

        for (Info i : stringSet){
            System.out.println(i);
        }
    }
}
