package com.mau.exercicio15;
import java.util.Scanner;

public class Exercicio15 {
	static String[] vetorNome = new String[10];
	static String[] vetorEmail = new String[10];
	static String[] vetorTelefone = new String[10];
	static Integer contador = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String cadastroNome = "";
		String cadastroTelefone = "";
		String cadastroEmail = "";
		String entradaUsuario = "";

		do {
			
			if (contador <= 9) {
				
				System.out.println("Digite Seu Nome: ");
				cadastroNome = input.next();
				
				System.out.println("Digite Seu Telefone:");
				cadastroTelefone = input.next();
				
				System.out.println("Digite Seu Email:");
				cadastroEmail = input.next();

				CadastroClientes(cadastroNome, cadastroEmail, cadastroTelefone, contador);
				contador++;
				
				System.out.println("Para continuar cadastrando digite" + " [S] ");
				entradaUsuario = input.next();
				
			}else{
				System.out.println("Espaço de armazenamento é insuficiente.");
				System.out.println("");
				break;
			}
		} while (entradaUsuario.equalsIgnoreCase("S"));

		for (int x = 0; x < contador; x++) {
			listarClientes(x);
		}

	}

	static void CadastroClientes(String nome, String email, String telefone, Integer n) {

		vetorNome[n] = nome;
		vetorTelefone[n] = telefone;
		vetorEmail[n] = email;

	}

	static void listarClientes(Integer n) {
		System.out.println("Nome do cliente: "+ vetorNome[n]);
		System.out.println("Telefone do cliente: "+ vetorTelefone[n]);
		System.out.println("E-mail do cliente: "+ vetorEmail[n]);
		System.out.println("\n");
	}
}