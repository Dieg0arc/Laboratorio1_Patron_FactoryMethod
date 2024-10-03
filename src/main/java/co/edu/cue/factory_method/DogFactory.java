package co.edu.cue.factory_method;

public class DogFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Dog();
    }
}