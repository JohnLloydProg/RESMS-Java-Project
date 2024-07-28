/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.RESMS.libs.object;

import com.RESMS.libs.fileSystem.FileVisitor;
/**
 *
 * @author acer
 */
public interface IData {
  public void fileAction(FileVisitor visitor);
  public String toCSV();
}
