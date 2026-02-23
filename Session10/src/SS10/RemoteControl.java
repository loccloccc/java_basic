package SS10;

public interface RemoteControl {
    public void powerOn();
    default void checkBattery(){
        System.out.println("Pin on dinh");
    }
}
