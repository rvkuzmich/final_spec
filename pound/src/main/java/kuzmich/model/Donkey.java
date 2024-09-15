package kuzmich.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "donkey")
public class Donkey extends PackAnimal{

    public Donkey(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }
    public Donkey(String name, String birthDate) {
        super(name, birthDate);
    }
}
