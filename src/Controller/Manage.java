/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Info;
import java.util.ArrayList;
/**
 *
 * @author CHUCDY
 */
public class Manage {
    public static void addContact(ArrayList<Info> info){
        System.out.print("Enter id contact: ");
        int id = Valide.checkInputInt();
        System.out.print("Enter first name: ");
        String fName = Valide.checkInputString();
        System.out.print("Enter last name: ");
        String lName = Valide.checkInputString();
        System.out.print("Enter Group: ");
        String group = Valide.checkInputString();
        System.out.print("Enter Address: ");
        String address = Valide.checkInputString();
        System.out.print("Enter phone: ");
        String phone = Valide.checkInputPhone();
        info.add(new Info(id, lName+fName, group, address, phone, fName, lName));
        System.err.println("Successful");
    }
    public static void display(ArrayList<Info> info){
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (Info information : info) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    information.getID(), information.getName(),
                    information.getFname(), information.getLname(),
                    information.getGroup(), information.getAddress(), information.getPhone());
        }
    }
    public static Info getContactById(ArrayList<Info> info, int idDelete) {
        for (Info information : info) {
            if (information.getID() == idDelete) {
                return information;
            }
        }
        return null;
    }
    public static void delete(ArrayList<Info> info) {
        System.out.print("Enter id: ");
        int idDelete = Valide.checkInputInt();
        Info contactDelete = getContactById(info, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            info.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }
}
