package SS10;

public class Fish extends Animal implements Swimmable{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("FISH la lao dong vat biet boi");

    }
}
