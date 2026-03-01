package bai5;

import java.util.Objects;

public class Patient implements Comparable<Patient>{
    private String name;
    private  int severity;
    private  int arrivalTime;

    public Patient() {
    }

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }
    public int getSeverity() {
        return severity;
    }
    public int getArrivalTime() {
        return arrivalTime;
    }


    @Override
    public String toString() {
        return name +" - "+ severity;
    }
    @Override
    public int compareTo(Patient o) {
        if (this.severity != o.severity) return this.severity - o.severity;
        return this.arrivalTime - o.arrivalTime;

    }
}
