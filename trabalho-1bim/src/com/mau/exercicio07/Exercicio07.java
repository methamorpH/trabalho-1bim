package com.mau.exercicio07;
import java.util.Scanner;

public class Exercicio07 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu Login:");
		String login = input.nextLine();
		
		System.out.println("Digite sua Senha:");
		String senha = input.next();
		
		if(login.equals("admin") && senha.equals("admin")){
			System.out.println("Login efetuado com sucesso!");
			
		}else{
			System.out.println("Usuário e/ou senha incorretos.");
		}
	}

}