/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Manage;
import Model.Info;
import java.util.ArrayList;

/**
 *
 * @author CHUCDY
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.displayMainMenu();
    }
    
     public void displayMainMenu() {
        ArrayList<Info> info = new ArrayList<>();
        info.add(new Info(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        info.add(new Info(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        info.add(new Info(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez")); 
        Menu<String> mainMenu = new Menu<>("====CONTACT PROGRAM====", new String[]{
            "Add a Contact",
            "Display all Contact",
            "Delete a Contact",
            "Exit"
        }) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1 ->                   
                        Manage.addContact(info);               
                    case 2 ->
                        Manage.display(info);
                    case 3 ->
                        Manage.delete(info);
                    case 4 ->
                        System.exit(0);
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };
        
        mainMenu.run();
    }     
}