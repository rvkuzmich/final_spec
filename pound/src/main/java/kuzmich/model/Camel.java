package kuzmich.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "camel")
public class Camel extends PackAnimal{

    public Camel(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }
    public Camel(String name, String birthDate) {
        super(name, birthDate);
    }
}
