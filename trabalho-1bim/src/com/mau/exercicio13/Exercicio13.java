package com.mau.exercicio13;
import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args){
		
		Integer opcao;
		Scanner input = new Scanner(System.in);
		
		do {
				menu();
				opcao = input.nextInt();
				
				switch(opcao){
				case 1: opcao1(); break;
				case 2: opcao2(); break;
				case 3: opcao3(); break;
				case 4: opcao4(); break;
				case 5: opcao5(); break;
				}
		} while(opcao !=0);
	}

	public static void menu() {
		
		System.out.println("\tMenu Simples");
		System.out.println("0. Fim");
		System.out.println("1. Primeira Op��o");
		System.out.println("2. Segunda Op��o");
		System.out.println("3. Terceira Op��o");
		System.out.println("4. Quarta Op��o");
		System.out.println("5. Quinta Op��o");
		System.out.println("Op��o:");
		
	}
	
	public static void opcao1(){
		System.out.println("Voc� entrou na Primeira Op��o");
	}
	
	public static void opcao2(){
		System.out.println("Voc� entrou na Segunga Op��o");
	}
	
	public static void opcao3(){
		System.out.println("Voc� entrou na Terceira Op��o");
	}
	
	public static void opcao4(){
		System.out.println("Voc� entrou na Quarta Op��o");
	}
	
	public static void opcao5(){
		System.out.println("Voc� entrou na Quinta Op��o");
	}
	
}