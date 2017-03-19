package com.mau.exercicio12;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Integer tamVetor = 10;
		Integer vetor[] = new Integer[tamVetor];
		Integer indice;
		
		for(indice=0; indice<tamVetor; indice++){
			System.out.println("Digite o "+ (indice+1) + "º valor: ");
			vetor[indice] = input.nextInt();
		}
		
		Integer soma = 0;
		for(indice=0; indice<tamVetor; indice++){
			soma = soma + vetor[indice];
		}
		
		System.out.println("A soma total dos valores do Vetor é: "+soma);
		
	}

}