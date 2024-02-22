/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.ldnr.elisa.swingpopup;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Elisa Bothy
 */
public class SwingPopup {

    public static void main(String[] args) {
        ImageIcon catIcon = new ImageIcon("chat.png");
        
        //Boîte avec Yes No Cancel
        int choice = JOptionPane.showConfirmDialog(null, "Êtes-vous d'accord ?");
        JOptionPane.showMessageDialog(
                null, 
                "Vous avez choisi : " + choice, 
                "Votre choix", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        //Boîte input : saisie valeur
        String value = JOptionPane.showInputDialog(
                null, 
                "Quel est votre animal préféré ?", 
                "Parlez-nous de vous", 
                JOptionPane.QUESTION_MESSAGE                
        );
        JOptionPane.showMessageDialog(
                null, 
                "Vous avez choisi : " + value, 
                "Votre choix", 
                JOptionPane.PLAIN_MESSAGE,
                catIcon
        );
        //tableau pour avoir plusieurs valeurs
        String[] animals = new String[6];
        animals[0] = "Chat"; 
        animals[1] = "Chien"; 
        animals[2] = "Lapin"; 
        animals[3] = "Fourmis"; 
        animals[4] = "Elephant"; 
        animals[5] = "Hamster"; 
        
        //Boîte choix liste déroulante
        Object obj = JOptionPane.showInputDialog(
                null, 
                "Quel est votre animal préféré ?", 
                "Parlez-nous de vous", 
                JOptionPane.PLAIN_MESSAGE,
                catIcon,
                animals,
                animals[0]                
        );
        JOptionPane.showMessageDialog(
                null, 
                "Vous avez choisi : " + obj, 
                "Votre choix", 
                JOptionPane.PLAIN_MESSAGE,
                catIcon
        );
        
        //Boîte choix avec boutons
        int index = JOptionPane.showOptionDialog(
                null, 
                "Choisissez un animal",
                "Votre choix",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                catIcon,
                animals,
                animals[0]
        );
        JOptionPane.showMessageDialog(
                null, 
                "Vous avez choisi : " + index, 
                "Votre choix", 
                JOptionPane.PLAIN_MESSAGE,
                catIcon
        );
    }
}
