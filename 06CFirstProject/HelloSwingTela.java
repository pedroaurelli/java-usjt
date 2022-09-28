/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.first_project;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author zpeed
 */
public class HelloSwingTela {
  public static void createView () {
//    importando a classe JFrame para manipular um molde do app
    JFrame tela = new JFrame("Hello, Swing Top!!");
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel helloSwingLabel =  new JLabel("Hello, Swing Label!!!");
    
    Container contentPanel = tela.getContentPane();
    contentPanel.add(helloSwingLabel);
    
    tela.pack();
    tela.setVisible(true);
  }
  
  public static void main (String[] args) {
    SwingUtilities.invokeLater(() -> {
      createView();
    });
  }
}
