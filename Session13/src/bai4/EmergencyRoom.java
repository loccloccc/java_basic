package bai4;

import java.util.LinkedList;

public class EmergencyRoom {
    LinkedList<String> linkedList;

    public EmergencyRoom() {
        this.linkedList = new LinkedList<>();
    }
    public boolean patientCheckIn(String name){
        return linkedList.add(name);
    }
    public void emergencyCheckIn(String name){
        linkedList.add(0,name);
    }
    public void treatPatient(){
        if (linkedList.isEmpty()) {
            System.out.println("khong co banh nhan nao") ;
            return;
        }
        for (String x : linkedList){
            System.out.println(x + " ");
        }
    }
}
