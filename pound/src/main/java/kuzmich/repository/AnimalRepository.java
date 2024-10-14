package kuzmich.repository;


import kuzmich.Counter;
import kuzmich.model.*;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository<Animal> {
    List<Animal> animals = new ArrayList<>();

    public List<Animal> getAllAnimals() {
        return List.copyOf(animals);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getCamels() {
        return List.copyOf(animals.stream().filter(Camel.class::isInstance).toList());
    }

    public List<Animal> getCats() {
        return List.copyOf(animals.stream().filter(Cat.class::isInstance).toList());
    }

    public List<Animal> getDogs() {
        return List.copyOf(animals.stream().filter(Dog.class::isInstance).toList());
    }

    public List<Animal> getDonkeys() {
        return List.copyOf(animals.stream().filter(Donkey.class::isInstance).toList());
    }

    public List<Animal> getHamsters() {
        return List.copyOf(animals.stream().filter(Hamster.class::isInstance).toList());
    }

    public List<Animal> getHorses() {
        return List.copyOf(animals.stream().filter(Horse.class::isInstance).toList());
    }

    public Camel getCamel(String name) {
        List<Camel> camels = (List<Camel>) this.getCamels();
        Camel camel = null;
        for (Camel c : camels) {
            if (c.getName().equals(name)) {
                camel = c;
                break;
            }
        }
        return camel;
    }

    public Cat getCat(String name) {
        List<Cat> cats = (List<Cat>) this.getCats();
        Cat cat = null;
        for (Cat c : cats) {
            if (c.getName().equals(name)) {
                cat = c;
                break;
            }
        }
        return cat;
    }

    public Dog getDog(String name) {
        List<Dog> dogs = (List<Dog>) this.getDogs();
        Dog dog = null;
        for (Dog d : dogs) {
            if (d.getName().equals(name)) {
                dog = d;
                break;
            }
        }
        return dog;
    }

    public Donkey getDonkey(String name) {
        List<Donkey> donkeys = (List<Donkey>) this.getDonkeys();
        Donkey donkey = null;
        for (Donkey d : donkeys) {
            if (d.getName().equals(name)) {
                donkey = d;
                break;
            }
        }
        return donkey;
    }

    public Hamster getHamster(String name) {
        List<Hamster> hamsters = (List<Hamster>) this.getHamsters();
        Hamster hamster = null;
        for (Hamster h : hamsters) {
            if (h.getName().equals(name)) {
                hamster = h;
                break;
            }
        }
        return hamster;
    }

    public Horse getHorse(String name) {
        List<Horse> horses = (List<Horse>) this.getHorses();
        Horse horse = null;
        for (Horse h : horses) {
            if (h.getName().equals(name)) {
                horse = h;
                break;
            }
        }
        return horse;
    }
}
