package co.edu.cue.factory_method;

public class Dog implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

