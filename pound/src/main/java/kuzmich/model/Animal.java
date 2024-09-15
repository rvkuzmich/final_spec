package kuzmich.model;

import jakarta.persistence.*;
import kuzmich.Counter;

import java.util.ArrayList;
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String birthDate;
    private ArrayList<String> commands = new ArrayList<>();
    private Counter counter;

    public  Animal(){}

    public Animal(int id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    public Animal(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", commands=" + commands +
                '}';
    }

    public void showCommnads() {
        System.out.println("This animal has next commands:");
        for (String command : this.commands) {
            System.out.print(command + ", ");
        }
    }

    public void trainNewCommand(String command) {
        this.commands.add(command);
        System.out.printf("Animal %s learned new command - %s\n", this.name, command);
    }
}
