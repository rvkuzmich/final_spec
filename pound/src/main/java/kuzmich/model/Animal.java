package kuzmich.model;

import java.util.ArrayList;
public abstract class Animal {
    private String name;
    private String birthDate;
    private ArrayList<String> commands = new ArrayList<>();

    public Animal(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getCommands() {
        return this.commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
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
            System.out.println();
        }
    }

    public void trainNewCommand(String command) {
        this.commands.add(command);
        System.out.printf("Animal %s learned new command - %s\n", this.name, command);
    }
}
