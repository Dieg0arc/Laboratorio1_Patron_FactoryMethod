package co.edu.cue.factory_method;

public class Cat implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
