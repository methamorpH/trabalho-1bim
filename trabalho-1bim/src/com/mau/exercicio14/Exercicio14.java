package com.mau.exercicio14;
import java.util.Scanner;

public class Exercicio14 {
	
	static double num1, num2, resultado; 
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Integer opcoes;
		
		System.out.println("\t Calculadora - Escolha uma Op��o");
		System.out.println("1. Soma");
		System.out.println("2. Subtra��o");
		System.out.println("3. Multiplica��o");
		System.out.println("4. Divis�o");
		System.out.println("5. Potencia��o");
		System.out.println("6. Fatorial");
		
		opcoes = input.nextInt();
		
		switch(opcoes){
		case 1: opcao1(); break;
		case 2: opcao2(); break;
		case 3: opcao3(); break;
		case 4: opcao4(); break;
		case 5: opcao5(); break;
		case 6: opcao6(); break;
		default: break;
		}
	}		
		static void opcao1(){
			System.out.println("Digite o primeiro valor:");
			num1 = input.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			num2 = input.nextDouble();
			
			resultado = num1 + num2;
			System.out.println("A soma dos valores �: "+resultado);
		}
		
		static void opcao2(){
			System.out.println("Digite o primeiro valor:");
			num1 = input.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			num2 = input.nextDouble();
			
			resultado = num1 - num2;
			System.out.println("A subtra��o dos valores �: "+resultado);
		}
		
		static void opcao3(){
			System.out.println("Digite o primeiro valor:");
			num1 = input.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			num2 = input.nextDouble();
			
			resultado = num1 * num2;
			System.out.println("A multiplica��o dos valores �: "+resultado);
		}
		
		static void opcao4(){
			System.out.println("Digite o primeiro valor:");
			num1 = input.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			num2 = input.nextDouble();
			
			resultado = num1 / num2;
			System.out.println("A divis�o dos valores �: "+resultado);
		}
		
		static void opcao5(){
			System.out.println("Digite o primeiro valor:");
			num1 = input.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			num2 = input.nextDouble();
			
			resultado = Math.pow(num1, num2);
			int resultadoFormatado = (int)resultado;
			System.out.println("O resultado da potencia��o dos valores �: "+resultadoFormatado);
		}
		
		static void opcao6(){
		System.out.println("Digite o valor � ser fatorado:");
		num1 = input.nextInt();
		resultado = 1;
			for (int x = 1; x <= num1; x++){
				resultado *= x;
				}
			System.out.println("O resultado da fatora��o �: "+resultado);
		}		
}