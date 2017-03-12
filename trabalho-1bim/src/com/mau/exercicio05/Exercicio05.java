package com.mau.exercicio05;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua nota:");
		double notaUsuario = input.nextDouble();
		
		if(notaUsuario>10.0){
			System.out.println("Nota inválida, insira um valor entre 0.0 e 10.0.");
		}
		else if(notaUsuario>=7.0) {
			System.out.println("APROVADO!");
		}
		else if(notaUsuario<7.0 && notaUsuario>=4.0){
			System.out.println("EM EXAME!");
		}
		else{
			System.out.println("REPROVADO!");
		}
		
	}

}