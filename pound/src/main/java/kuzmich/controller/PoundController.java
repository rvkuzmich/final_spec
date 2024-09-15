package kuzmich.controller;

import kuzmich.Counter;
import kuzmich.model.*;
import kuzmich.repository.Database;

import java.util.Scanner;

public class PoundController {
    Database database = new Database();

    public void start(Scanner scanner){
        outer:
        while(true) {
            System.out.println("Choose your option:");
            System.out.println("Menu\n1. Show animals counter\n2. Add new animal\n3. Exit");
            System.out.println();
            String choice = scanner.nextLine();
            switch(choice) {
                case "1" -> System.out.println(Counter.counter);
                case "2" -> database.addIntoDatabase(addNewAnimal(scanner));
                case "3" -> {
                    break outer;
                }
            }
        }
    }
    public Animal addNewAnimal(Scanner scanner) {
        System.out.println("What is animal's name?");
        String name = scanner.nextLine();
        System.out.println("What is animal's birthdate?");
        String birthDate = scanner.nextLine();
        System.out.println("What type of animal would you like to add?");
        System.out.println("1. Camel\n2. Cat\n3. Dog\n4. Donkey\n5. Hamster\n6. Horse");
        String choice = scanner.nextLine();
        Animal animal = switch(choice) {
            case "1" -> {
                yield new Camel(name, birthDate);
            }
            case "2" -> {
                yield new Cat(name, birthDate);
            }
            case "3" -> {
                yield new Dog(name, birthDate);
            }
            case "4" -> {
                yield new Donkey(name, birthDate);
            }
            case "5" -> {
                yield new Hamster(name, birthDate);
            }
            case "6" -> {
                yield new Horse(name, birthDate);
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
        return animal;
    }
}
