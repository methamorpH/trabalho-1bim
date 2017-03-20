package com.mau.exercicio16;
import java.util.Scanner;

public class Exercicio16 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] vetorNome = new String[10];
		
			for (int x=0; x<vetorNome.length; x++){
				
				System.out.println("Digite um nome: ");
				vetorNome[x] = input.nextLine();
			}
			
			for (String string : vetorNome){
				System.out.println("Nome: "+string);
			}

	}

}