package kuzmich;

import kuzmich.controller.PoundController;
import kuzmich.model.Animal;
import kuzmich.model.Dog;

import java.util.Scanner;

public class Pound
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        PoundController poundController = new PoundController();
        poundController.start(sc);

    }

}
