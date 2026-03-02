package bai4;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority;

    public EmergencyPatient() {
    }

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ten " + name + " muc do " + (priority == 1 ? " cap cuu" : " thuong");
    }


}
