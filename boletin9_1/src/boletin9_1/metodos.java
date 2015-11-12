/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

/**
 *
 * @author ngarciacarrillo
 */
public class metodos {
private float num;
private int cp;
private int cc;
private int cn;

public metodos(){

}

public void comparar(float num){
    this.num = num;
    if (num >0 ){
    cp++;
   
    }
    else if (num==0){
    cc++;
    
    } else {
    cn++;

    }
    }

public void mostrar(){
System.out.println("Os numeros negativos son "+cn);
System.out.println("Os numeros positivos son "+cp);
System.out.println("O numero de 0 son "+cc );
}
}
    

