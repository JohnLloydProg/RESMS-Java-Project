/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.mainMenu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;
/**
 *
 * @author JohnLloydProg
 */
public class GradientComponent extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        int width = this.getWidth();
        int height = this.getHeight();
        
        Color startColor = new Color(142, 202, 230);
        Color endColor = new Color(2, 48, 71);
        
        GradientPaint gradient = new GradientPaint(0, 100, startColor, 0, height, endColor);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, width, height);
    }
}
