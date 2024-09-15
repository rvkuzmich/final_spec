package kuzmich.model;

public abstract class Pet extends Animal{
    public Pet(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }
    public Pet (String name, String birthDate) {
        super(name, birthDate);
    }
}
