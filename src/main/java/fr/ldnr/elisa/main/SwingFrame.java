/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.main;

import java.awt.Color;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Elisa Bothy
 */
public class SwingFrame { 
        
    public static void main(String[] args) {
        ImageIcon catIcon = new ImageIcon("chat.png");
        
        //créer l'objet fenêtre
        JFrame frame = new JFrame("Fenêtre");
        Box vbox = Box.createVerticalBox();
      
        //ajouter des boutons
        JButton jb1 = new JButton(catIcon);
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JPanel north =new JPanel(); //par défaut avec un FlowLayout
        north.setBackground(Color.red);
        north.setOpaque(true);
        north.add(jb1);
        north.add(jb6);
        
        frame.getContentPane().add(vbox);
        vbox.add(north);
        vbox.add(jb2);
        vbox.add(jb3);
        vbox.add(jb4);
        vbox.add(jb5);
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
