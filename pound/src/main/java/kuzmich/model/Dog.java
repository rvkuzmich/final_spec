package kuzmich.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
@Entity
@Table(name = "dog")
public class Dog extends Pet{
    public Dog(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }
    public Dog(String name, String birthDate) {
        super(name, birthDate);
    }
}
