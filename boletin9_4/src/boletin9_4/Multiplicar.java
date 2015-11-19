package boletin9_4;


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
public class Multiplicar {
    private float num1;
    private float numM;
    private boolean seguir;
    public void tablaMultiplicar(){
        
        
        do {
            num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce un numero para saber la tabla de multiplicar, introduce 0 si quieres terminar"));
            if (num1 != 0){
                for (int i=1; i<=10; i++){
                    numM=num1*i;
                    System.out.println (numM);
                    numM=0;
                    seguir = true;
                    
        }}else{
            System.out.println("Gracias por usar el programa");
            seguir = false;
            }
        }while(seguir == true);
    
        
}
    
}
