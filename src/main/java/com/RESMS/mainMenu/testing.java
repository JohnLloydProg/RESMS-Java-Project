/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.mainMenu;

import com.RESMS.libs.fileSystem.Add;
import com.RESMS.libs.object.Property;
import com.RESMS.libs.fileSystem.Read;
/**
 *
 * @author JohnLloydProg
 */
public class testing {
    public static void main(String[] args) {
        Add add = new Add();
        Property property = Read.getProperty(3);
        System.out.println(property.toCSV());
    }
}
