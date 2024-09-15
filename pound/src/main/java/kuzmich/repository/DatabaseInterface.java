package kuzmich.repository;

import kuzmich.model.Animal;

public interface DatabaseInterface {
    void addIntoDatabase(Animal animal);
    void readFromDatabase();
    void updateLineInDatabase(Animal animal);
}
