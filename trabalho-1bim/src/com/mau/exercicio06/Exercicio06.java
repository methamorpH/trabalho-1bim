package com.mau.exercicio06;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu Login:");
		String login = input.nextLine();
		
		if(login.equals("admin")){
			System.out.println("Verdadeiro");
			
		}else{
			System.out.println("Falso");
		}
	}

}