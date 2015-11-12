/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int cc = 0;
    int cp = 0;
    int cn = 0;

    metodos metodo1 = new metodos();
    for(int i=0; i<10; i++){
    System.out.println("Introduce un numero");
    Scanner resposta = new Scanner (System.in);
    float num = resposta.nextFloat();
   
    metodo1.comparar(num);
    }metodo1.mostrar();
   
}}
