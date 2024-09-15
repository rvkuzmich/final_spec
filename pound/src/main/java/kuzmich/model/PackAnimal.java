package kuzmich.model;

import java.util.ArrayList;

public abstract class PackAnimal extends Animal{
    public PackAnimal(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }
    public PackAnimal (String name, String birthDate) {
        super(name, birthDate);
    }
}
