package com.mau.exercicio25;
import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String entradaUsuario;
		Integer contador = 0;
		
		do {
			
			System.out.println("Para entrar digite [Sim] e qualquer outra tecla para sair.");
			entradaUsuario = input.nextLine();
			
			if(entradaUsuario.equalsIgnoreCase("Sim")){
				
				contador++;
			}
			
		} while(entradaUsuario.equalsIgnoreCase("Sim"));
		
		System.out.println("O contador está marcando: "+contador+" acessos.");
				
	}

}