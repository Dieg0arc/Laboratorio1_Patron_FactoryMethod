package co.edu.cue.factory_method;

public class Main {
    public static void main(String[] args) {
        // Usando la fábrica de perros
        PetFactory dogFactory = new DogFactory();
        Pet dog = dogFactory.createPet();
        dog.makeSound();  // Output: Woof! Woof!

        // Usando la fábrica de gatos
        PetFactory catFactory = new CatFactory();
        Pet cat = catFactory.createPet();
        cat.makeSound();  // Output: Meow! Meow!
    }
}
