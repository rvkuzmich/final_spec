package kuzmich.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "horse")
public class Horse extends PackAnimal{
    public Horse(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }
    public Horse(String name, String birthDate) {
        super(name, birthDate);
    }
}
