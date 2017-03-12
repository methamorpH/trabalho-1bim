package com.mau.exercicio08;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("1 - Calcular Área do Triângulo");
		System.out.println("2 - Calcular Área do Quadrado");
		System.out.println("3 - Calcular Área do Retângulo");
		System.out.println("4 - Calcular Área do Círculo");
		System.out.println("5 - Calcular Área do Trapézio");
		
		int entradaUsuario = input.nextInt();
		
		if(entradaUsuario<1 || entradaUsuario>5){
			System.out.println("Entrada inválida, digite um número de 1 à 5.");
		}
		
		else if(entradaUsuario==1){
			
			System.out.println("Digite o valor da base do Triângulo:");
			double baseTriang = input.nextDouble();
			
			System.out.println("Digite o valor da altura do Triângulo:");
			double alturaTriang = input.nextDouble();
			
			double areaTriang = (baseTriang * alturaTriang)/2;
			System.out.println("A área do Triângulo vale: "+areaTriang);
		}
		
		else if(entradaUsuario==2){
			
			System.out.println("Digite o valor do comprimento do Quadrado:");
			double compQuadrado = input.nextDouble();
			
		    System.out.println("Digite o valor da largura do Quadrado:");
			double largQuadrado = input.nextDouble();
			 	
			double areaQuadrado = compQuadrado * largQuadrado;
		    System.out.println("A área do Quadrado vale: "+areaQuadrado);	
		}
		
		else if(entradaUsuario==3){
			
			System.out.println("Digite o valor do comprimento do Retângulo:");
			double compRetangulo = input.nextDouble();
			
			System.out.println("Digite o valor da largura do Retângulo:");
			double largRetangulo = input.nextDouble();
			
			double areaRetangulo = compRetangulo * largRetangulo;
			System.out.println("A área do Retângulo vale: "+areaRetangulo);	
		}
		
		else if(entradaUsuario==4){
			
			System.out.println("Digite o valor do raio do Círculo:");
			double raioCirculo = input.nextDouble();
			
			final double PI = 3.1456;
			
			double areaCirculo = raioCirculo * raioCirculo * PI;
			System.out.println("A área do círculo vale: "+areaCirculo);	
		}
		
		else if(entradaUsuario==5){
			
			System.out.println("Digite o valor da base maior do Trapézio:");
			double bMaiorTrapezio = input.nextDouble();
			
			System.out.println("Digite o valor da base menor do Trapézio:");
			double bMenorTrapezio = input.nextDouble();
			
		if(bMaiorTrapezio<bMenorTrapezio){
			System.out.println("A base menor do Trapézio não pode ter um valor superior que a base maior!");
		}else{
			
			System.out.println("Digite o valor da altura do Trapézio:");
		 	double alturaTrapezio = input.nextDouble();
		 	
		 	double areaTrapezio = ((bMaiorTrapezio+bMenorTrapezio)*alturaTrapezio)/2;
		 	System.out.println("A área do Trapézio vale: "+areaTrapezio); }
		}

	}

}