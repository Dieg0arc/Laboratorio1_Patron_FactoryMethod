package co.edu.cue.factory_method;

public class CatFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Cat();
    }
}