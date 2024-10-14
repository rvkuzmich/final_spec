package kuzmich;

import kuzmich.controller.PoundController;


import java.util.Scanner;

public class Pound
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        PoundController poundController = new PoundController();
        poundController.start(sc);

    }
}
