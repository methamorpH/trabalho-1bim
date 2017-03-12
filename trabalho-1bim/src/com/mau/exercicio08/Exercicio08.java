package com.mau.exercicio08;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("1 - Calcular �rea do Tri�ngulo");
		System.out.println("2 - Calcular �rea do Quadrado");
		System.out.println("3 - Calcular �rea do Ret�ngulo");
		System.out.println("4 - Calcular �rea do C�rculo");
		System.out.println("5 - Calcular �rea do Trap�zio");
		
		int entradaUsuario = input.nextInt();
		
		if(entradaUsuario<1 || entradaUsuario>5){
			System.out.println("Entrada inv�lida, digite um n�mero de 1 � 5.");
		}
		
		else if(entradaUsuario==1){
			
			System.out.println("Digite o valor da base do Tri�ngulo:");
			double baseTriang = input.nextDouble();
			
			System.out.println("Digite o valor da altura do Tri�ngulo:");
			double alturaTriang = input.nextDouble();
			
			double areaTriang = (baseTriang * alturaTriang)/2;
			System.out.println("A �rea do Tri�ngulo vale: "+areaTriang);
		}
		
		else if(entradaUsuario==2){
			
			System.out.println("Digite o valor do comprimento do Quadrado:");
			double compQuadrado = input.nextDouble();
			
		    System.out.println("Digite o valor da largura do Quadrado:");
			double largQuadrado = input.nextDouble();
			 	
			double areaQuadrado = compQuadrado * largQuadrado;
		    System.out.println("A �rea do Quadrado vale: "+areaQuadrado);	
		}
		
		else if(entradaUsuario==3){
			
			System.out.println("Digite o valor do comprimento do Ret�ngulo:");
			double compRetangulo = input.nextDouble();
			
			System.out.println("Digite o valor da largura do Ret�ngulo:");
			double largRetangulo = input.nextDouble();
			
			double areaRetangulo = compRetangulo * largRetangulo;
			System.out.println("A �rea do Ret�ngulo vale: "+areaRetangulo);	
		}
		
		else if(entradaUsuario==4){
			
			System.out.println("Digite o valor do raio do C�rculo:");
			double raioCirculo = input.nextDouble();
			
			final double PI = 3.1456;
			
			double areaCirculo = raioCirculo * raioCirculo * PI;
			System.out.println("A �rea do c�rculo vale: "+areaCirculo);	
		}
		
		else if(entradaUsuario==5){
			
			System.out.println("Digite o valor da base maior do Trap�zio:");
			double bMaiorTrapezio = input.nextDouble();
			
			System.out.println("Digite o valor da base menor do Trap�zio:");
			double bMenorTrapezio = input.nextDouble();
			
		if(bMaiorTrapezio<bMenorTrapezio){
			System.out.println("A base menor do Trap�zio n�o pode ter um valor superior que a base maior!");
		}else{
			
			System.out.println("Digite o valor da altura do Trap�zio:");
		 	double alturaTrapezio = input.nextDouble();
		 	
		 	double areaTrapezio = ((bMaiorTrapezio+bMenorTrapezio)*alturaTrapezio)/2;
		 	System.out.println("A �rea do Trap�zio vale: "+areaTrapezio); }
		}

	}

}