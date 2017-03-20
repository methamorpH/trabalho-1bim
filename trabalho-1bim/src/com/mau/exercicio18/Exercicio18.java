package com.mau.exercicio18;
import java.util.Random;

public class Exercicio18 {
	//Matriz 3x3 gerada com valores aleatórios
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		Integer[][] matriz = new Integer[3][3];

		for (int x = 0; x<matriz.length; x++) {

			for (int y = 0; y<matriz[y].length; y++) {
				
				matriz[x][y] = r.nextInt();
				
				System.out.print(matriz[x][y] + "    ");
			}
			System.out.println("\n");

		}
	}
}