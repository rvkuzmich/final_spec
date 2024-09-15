package kuzmich.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "cat")
public class Cat extends Pet{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String birthDate;
    private ArrayList<String> commands = new ArrayList<>();

    public Cat(int id, String name, String birthDate) {
        super(id, name, birthDate);
    }
    public Cat(String name, String birthDate) {
        super(name, birthDate);
    }
}
