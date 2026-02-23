package SS10;

public class bai4 {
    static void main(String[] args) {
        RemoteControl  smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Den da bat");
            }
        };
        smartLight.powerOn();
    }
}
