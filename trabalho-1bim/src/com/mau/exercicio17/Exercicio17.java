package com.mau.exercicio17;
import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String[] args){
    	
            Integer[] valorVetor = new Integer[3];
            Scanner input = new Scanner(System.in);
            
            for(int x=0; x<3 ; x++){
                System.out.print("\nDigite o " + (x+1) + "º" + " número" + ": ");
                valorVetor[x] = input.nextInt();
            }
            
            for(int x=0; x<3; x++){
                System.out.printf("Número %d -> Valor armazenado: %d\n",x+1, valorVetor[x]);
            }
        }

}