package boletin9_2;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ngarciacarrillo
 */
public class calcular {
    private double num;
    public void calcularSuma (){
    
        for (float i=10; i<=90; i++){
            num = num + i;
    
    }JOptionPane.showMessageDialog(null, "A suma e "+num);
    }
    public void calcularMultiplicacion(){
         num = 1;
         for (double i=10; i<=90; i++){
            
            num = (double)(num * i);
             
    }JOptionPane.showMessageDialog(null, "A multiplicacion e "+num);
    
}}
