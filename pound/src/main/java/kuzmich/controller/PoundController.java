package kuzmich.controller;

import kuzmich.Counter;
import kuzmich.model.*;
import kuzmich.repository.AnimalRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class PoundController {
    AnimalRepository animalRepository = new AnimalRepository();

    public void start(Scanner scanner) {
        outer:
        while (true) {
            System.out.println("Choose your option:");
            System.out.println("Menu\n1. Show animals counter\n2. Add new animal\n3. Add command to animal\n" +
                    "4. Show animal commands\n5. Show all animals\n6. Show all camels\n7. Show all cats\n8. Show all dogs\n" +
                    "9. Show all donkeys\n10. Show all hamsters\n11. Show all horses\n12. Exit");
            System.out.println();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> {
                    try {
                        countAnimals();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case "2" -> animalRepository.addAnimal(addNewAnimal(scanner));
                case "3" -> addCommand(scanner);
                case "4" -> getAnimalCommands(scanner);
                case "5" -> System.out.println(animalRepository.getAllAnimals());
                case "6" -> System.out.println(animalRepository.getCamels());
                case "7" -> System.out.println(animalRepository.getCats());
                case "8" -> System.out.println(animalRepository.getDogs());
                case "9" -> System.out.println(animalRepository.getDonkeys());
                case "10" -> System.out.println(animalRepository.getHamsters());
                case "11" -> System.out.println(animalRepository.getHorses());
                case "12" -> {
                    break outer;
                }
            }
        }
    }

    public Animal addNewAnimal(Scanner scanner) {
        try (Counter counter = new Counter()){
            counter.add();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("What is animal's name?");
        String name = scanner.nextLine();
        System.out.println("What is animal's birthdate?");
        String birthDate = scanner.nextLine();
        System.out.println("What type is your animal?");
        System.out.println("1. Camel\n2. Cat\n3. Dog\n4. Donkey\n5. Hamster\n6. Horse");
        String choice = scanner.nextLine();
        Animal animal = switch (choice) {
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

    private void addCommand(Scanner scanner) {
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();
        Animal animal;
        ArrayList<String> commands;
        if (animalRepository.getCamel(name) != null) {
            animal = animalRepository.getCamel(name);
        } else if (animalRepository.getCat(name) != null) {
            animal = animalRepository.getCat(name);
        } else if (animalRepository.getDog(name) != null) {
            animal = animalRepository.getDog(name);
        } else if (animalRepository.getDonkey(name) != null) {
            animal = animalRepository.getDonkey(name);
        } else if (animalRepository.getHamster(name) != null) {
            animal = animalRepository.getHamster(name);
        } else if (animalRepository.getHorse(name) != null) {
            animal = animalRepository.getHorse(name);
        } else {
            System.out.println("There is no such animal");
            return;
        }
        String command = setCommandToAdd(scanner);
        animal.trainNewCommand(command);
    }

    private void getAnimalCommands(Scanner scanner) {
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();
        Animal animal;
        if (animalRepository.getCamel(name) != null) {
            animal = animalRepository.getCamel(name);
        } else if (animalRepository.getCat(name) != null) {
            animal = animalRepository.getCat(name);
        } else if (animalRepository.getDog(name) != null) {
            animal = animalRepository.getDog(name);
        } else if (animalRepository.getDonkey(name) != null) {
            animal = animalRepository.getDonkey(name);
        } else if (animalRepository.getHamster(name) != null) {
            animal = animalRepository.getHamster(name);
        } else if (animalRepository.getHorse(name) != null) {
            animal = animalRepository.getHorse(name);
        } else {
            System.out.println("There is no such animal");
            return;
        }
        animal.showCommnads();
    }

    public String setCommandToAdd(Scanner scanner) {
        System.out.println("What command to add?");
        return scanner.nextLine();
    }

    public void countAnimals() throws Exception {
        try (Counter counter = new Counter()){
            if (counter.getCount() == 0) {
                System.out.println("There are no animals in the pound.");
            } else if (counter.getCount() == 1) {
                System.out.println("There is just " + counter.getCount() + " animal in the pound.");
            } else {
                System.out.println("There are " + counter.getCount() + " animals in the pound.");
            }
        }
    }
}
