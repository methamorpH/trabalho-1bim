package com.mau.exercicio10;
import java.util.Scanner;

public class Exercicio10 {
	
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
			
		System.out.println("Os lados informados podem formar um Triângulo.");
		 			
		}else{
			
		System.out.println("Os lados informados não podem formar um Triângulo.");
		}
	}
}