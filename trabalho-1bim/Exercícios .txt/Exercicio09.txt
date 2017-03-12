package com.mau.exercicio09;
import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite o tamanho do primeiro lado do Triângulo:");
		a = input.nextDouble();
		
		System.out.println("Digite o tamanho do segundo lado do Triângulo:");
		b = input.nextDouble();
		
		System.out.println("Digite o tamanho do terceiro lado do Triângulo:");
		c = input.nextDouble();
		
		if(a < (b + c) && b < (a + c) && c < (a + b)){
			//Testa se os lados a, b e c formam um triângulo
			
			if (a==b && b==c){
				System.out.println("Os lados informados formam um Triângulo Equilátero.");
			}
			
			else if(a==b || b==c || a==c){
				System.out.println("Os lados informados formam um Triângulo Isósceles.");
				
			}else{
				
				System.out.println("Os lados informados formam um Triângulo Escaleno.");
			}
			
		}else{
			
			System.out.println("Os lados informados não formam um triângulo, tente novamente!");
		}
	}

}