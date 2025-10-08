package UML;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog somers = new Dog("Somers", 15, "cihuahua");

        animal.setAge(10);
        animal.setName("gunko");
        animal.makeSound();
        System.out.println(animal.toString());

        somers.makeSound();
        System.out.println(somers.toString());
    }
}
