package com.mau.exercicio01;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num1, num2, soma;
		
		System.out.println("Digite o primeiro valor:");
		num1 = input.nextDouble();
		
		System.out.println("Digite o segundo valor:");
		num2 = input.nextDouble();
		
		soma = num1 + num2;
		
		System.out.println("A soma de "+num1+" + "+num2+" vale: "+soma);

	}

}