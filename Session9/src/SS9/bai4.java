package SS9;

public class bai4 {
    static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.sound2();
        }
    }
}
