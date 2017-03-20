package com.mau.exercicio20;
import java.util.Scanner;

public class Exercicio20 {
	
	 public static void main(String[] args) {
		 
	        Scanner input = new Scanner(System.in);

	        System.out.print("\nDigite o número de linhas da matriz: ");
	        Integer lin = input.nextInt();

	        System.out.print("\nDigite o número de colunas da matriz: ");
	        Integer col = input.nextInt();

	        Integer[][] matriz = new Integer[lin][col];

	        fillMatriz(lin, col, matriz);

	        for (int x=0; x<lin; x++){
	        	
	            for (int y=0; y<col; y++){
	            	
	                if (matriz[x][y] < 10)
	                    System.out.print("0" +matriz[x][y] + "    ");
	                
	                else
	                    System.out.print(matriz[x][y] + "    ");
	            }
	            System.out.println();
	        }
	    }

	    private static Integer[][] fillMatriz(Integer lin, Integer col, Integer[][] matriz) {
	    	
	        Integer contador = 1;

	        for (int x=0; x<lin; x++){
	        	
	            for (int y=0; y<col; y++){
	            	
	                    matriz[x][y] = contador;
	                    contador++;
	            }
	        }
	        
	        return matriz;
	    }
}