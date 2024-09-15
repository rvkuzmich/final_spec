package kuzmich.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hamster")
public class Hamster extends Pet{

    public Hamster(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }
    public Hamster(String name, String birthDate) {
        super(name, birthDate);
    }
}
