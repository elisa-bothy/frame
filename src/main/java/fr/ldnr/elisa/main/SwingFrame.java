/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
        frame.getContentPane().setLayout(new BorderLayout());
        
        //ajouter des boutons
        JButton jb1 = new JButton("1");
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
        
        frame.getContentPane().add(north, BorderLayout.NORTH);
        frame.getContentPane().add(jb2, BorderLayout.SOUTH);
        frame.getContentPane().add(jb3, BorderLayout.EAST);
        frame.getContentPane().add(jb4, BorderLayout.WEST);
        frame.getContentPane().add(jb5, BorderLayout.CENTER);
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
