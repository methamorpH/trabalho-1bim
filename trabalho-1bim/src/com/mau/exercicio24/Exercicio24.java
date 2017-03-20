package com.mau.exercicio24;
import java.util.Scanner;

public class Exercicio24 {
	
	static Scanner input = new Scanner(System.in);
	static Integer indice;
	static Integer novoValor;
	
public static void main(String[] args) {
		
        Integer[] vetor = {12, 27, 5, 65, 8};
        
        System.out.print("Vetor: "+vetor[0] +" "+vetor[1]+" "+vetor[2]+" "+vetor[3]+" "+vetor[4]);
        System.out.println("\n");
        
        {
        	
        	System.out.println("Digite qual posição do vetor será alterada (de 0 à 4):");
        	indice = input.nextInt();
        	
        	System.out.println("Digite o novo valor à ser atribuído na posição escolhida:");
        	novoValor = input.nextInt();
        	vetor[indice] = novoValor;
        	
        }
        
        System.out.println("O vetor com o valor alterado: "+vetor[0] +" "+vetor[1]+" "+vetor[2]+" "+vetor[3]+" "+vetor[4]);
        	

        }
}