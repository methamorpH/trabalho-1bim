package com.mau.exercicio10;
import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double a, b, c;
			
		System.out.println("Digite o tamanho do primeiro lado do Tri�ngulo:");
		a = input.nextDouble();
			
		System.out.println("Digite o tamanho do segundo lado do Tri�ngulo:");
		b = input.nextDouble();
			
		System.out.println("Digite o tamanho do terceiro lado do Tri�ngulo:");
		 c = input.nextDouble();
		 	
		if(a < (b + c) && b < (a + c) && c < (a + b)){
			
		System.out.println("Os lados informados podem formar um Tri�ngulo.");
		 			
		}else{
			
		System.out.println("Os lados informados n�o podem formar um Tri�ngulo.");
		}
	}
}