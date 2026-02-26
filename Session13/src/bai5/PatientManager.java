package bai5;

import java.util.ArrayList;
import java.util.List;

public class PatientManager {
    List<Patient> list;

    public PatientManager() {
        this.list = new ArrayList<>();
    }

    // them benh nhan
    public boolean addPatient(Patient p){
        return list.add(p);
    }
    // cap nhap theo id
    public Patient updateID(String id , Patient p){
        int index = checkId(id);
        if (index == -1){
            return null;
        }else {
            return list.set(index,p);
        }
    }
    // xoa theo id
    public  Patient deleteID(String id){
        int index = checkId(id);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                index = i;
                break;
            }
        }
        if (index == -1){
            return null;
        }else {
            return list.remove(index);
        }
    }
    // sap xep theo tuoi cao -> thap , bang tuoi thi theo az
    public void sort(){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).getAge() > list.get(j).getAge()){
                    Patient temp = list.get(i);
                    list.set(i , list.get(j));
                    list.set(j, temp);
                }
                if (list.get(i).getAge() == list.get(j).getAge()){
                    if (list.get(i).getFullName().compareTo(list.get(j).getFullName()) > 0){
                        Patient temp = list.get(i);
                        list.set(i,list.get(j));
                        list.set(j,temp);
                    }
                }
            }
        }
        System.out.println("Sap sep thanh cong : ");
        render();
    }
    public void render(){
        if (list.isEmpty()) {
            System.out.println("Khong co benh nhan nao ...");
            return;
        }
        for (Patient p : list){
            System.out.println("=====================================");
            System.out.println("ID : " + p.getId());
            System.out.println("Ten : " + p.getFullName());
            System.out.println("Tuoi : " + p.getAge());
            System.out.println("Benh : " + p.getDiagnosis());
            System.out.println("=====================================");
        }
    }
    // check id
    public int checkId(String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
