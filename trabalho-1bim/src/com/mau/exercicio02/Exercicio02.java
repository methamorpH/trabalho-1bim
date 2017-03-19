package com.mau.exercicio02;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num1, num2, produto;
		
		System.out.println("Digite o primeiro valor:");
		num1 = input.nextDouble();
		
		System.out.println("Digite o segundo valor:");
		num2 = input.nextDouble();
		
		produto = num1 * num2;
		
		System.out.println("A multiplicação de "+num1+" x "+num2+ " vale: "+produto);
		

	}

}