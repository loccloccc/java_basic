package SS10;

public class Duck extends Animal implements  Swimmable , Flyable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("DUCK la loai dong vat biet bay");
    }

    @Override
    public void swim() {
        System.out.println("Duck cung la loai dong vat biet boi");
    }
}
