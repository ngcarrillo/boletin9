/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class CalcularArea {
    private float base;
    private float altura;
    private boolean i;

    
public void comprobar(){
do {    
      base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
     
if(base<=0||altura<=0){
 JOptionPane.showMessageDialog (null,"Introduce solo valores positivos");
  i= true;
} else {
    
  this.base=base;
  this.altura=altura;
  i=false;
}
}while (i==true);
} 

public void mostrar(){

JOptionPane.showMessageDialog(null,"A area é " +(base*altura));


}

}


