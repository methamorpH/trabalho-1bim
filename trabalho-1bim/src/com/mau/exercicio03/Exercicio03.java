package com.mau.exercicio03;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Integer num1, resultado;
		
		System.out.println("Digite o número:");
		num1 = input.nextInt();
		
		resultado = num1 * num1;
		
		System.out.println("O resultado de "+num1+" elevado à dois vale: "+resultado);

	}

}