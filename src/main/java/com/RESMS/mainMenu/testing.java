/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.mainMenu;

import com.RESMS.libs.fileSystem.Add;
import com.RESMS.libs.fileSystem.Read;
import com.RESMS.libs.object.Property;
import com.RESMS.libs.factory.PropertyFactory;
import java.util.Scanner;
/**
 *
 * @author JohnLloydProg
 */
public class testing {
    public static void main(String[] args) {
        Add add = new Add();
        PropertyFactory factory = new PropertyFactory();
        Scanner input = new Scanner(System.in);
        Property property;
        int lot, block;
        double srp, size;
        String description, choice;
        while (true) {
            System.out.print("Lot: ");
            lot = Integer.parseInt(input.nextLine());
            System.out.print("Block: ");
            block = Integer.parseInt(input.nextLine());
            System.out.print("SRP: ");
            srp = Double.parseDouble(input.nextLine());
            System.out.print("Size: ");
            size = Double.parseDouble(input.nextLine());
            System.out.print("Description: ");
            description = input.nextLine();
            property = factory.createData(lot, block, srp, size, description);
            if (!hasCopy(property)) {
                property.fileAction(add);
            }else {
                System.out.println("Place all ready occupied!");
            }
            System.out.print("Do you want to continue? y/n: ");
            choice = input.nextLine();
            if (choice.contentEquals("n")) {
                break;
            }
        }
    }
    
    public static boolean hasCopy(Property property) {
        for (Property propertyData : Read.getProperties()) {
            if ((property.getLot() == propertyData.getLot()) && (property.getBlock() == propertyData.getBlock())) {
                return true;
            }
        }
        return false;
    }
}
