/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.temperature_converter;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author zpeed
 */
public class TemperatureConverter {
  public static void createView () {
    
    //1 - construir a moldura JFrame
    JFrame view = new JFrame("Converter");
    
    //2 - construir o campo que o usuario vai digital(JTextField)
    JTextField celsiusTextField = new JTextField(10);
    
    //3 - construir label que mostra o °C (JLabel)
    JLabel celsiusLabel = new JLabel("\u00B0C");
    
    //4 - botão para fazer a conversão (JButton)
    JButton converterButton = new JButton("Convert");
    
    //5 - contruir label que mostra a temperatura convertida (JLabel)
    JLabel convertedValeuLabel = new JLabel("");
    
    //6 - criar o painel de visualização, fica dentro do nosso view
    Container contentPanel = view.getContentPane();
    
    //7 - criando um grid layout para meu app
    contentPanel.setLayout(new GridLayout(2, 2, 4, 4));
    contentPanel.add(celsiusTextField);
    contentPanel.add(celsiusLabel);
    contentPanel.add(converterButton);
    contentPanel.add(convertedValeuLabel);
    
    //8 - Criando um evento para o botão
    converterButton.addActionListener((event) -> {
      //1. Pegar e transformar o valor digitado pelo user
      double celsiusDouble = Double.parseDouble(celsiusTextField.getText());
      
      //2. Converter de celsius para fahrenheit
      String fahrenheitResult = Double.toString(celsiusDouble / 5 * 9 + 32);
      
      //3. Fazer com que o convertedValeuLabel exiba o resultado
      convertedValeuLabel.setText(fahrenheitResult);
    });
    
    view.pack();
    view.setLocationRelativeTo(null);
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    view.setVisible(true);
  }
  
  public static void main (String[] args) {
    SwingUtilities.invokeLater(() -> {
      createView();
    });
  }
}
