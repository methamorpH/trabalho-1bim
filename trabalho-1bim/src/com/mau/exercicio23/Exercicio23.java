package com.mau.exercicio23;

public class Exercicio23 {
	
	 public static void main (String[]args) {
		 
	        Integer[][] matriz = new Integer[5][5];
	        Integer contador = 1;

	        for (int x=0; x<matriz.length; x++){
	        	
	            for (int y=0; y<matriz.length; y++){
	            	
	                matriz[x][y] = contador;
	                contador++;
	            }
	        }

	        matrizCopia(matriz);
	    }

	    private static void matrizCopia(Integer[][] matriz) {
	    	
	        Integer[][] matrizCopia = new Integer[5][5];

	        for (int x=0; x<matriz.length; x++){
	        	
	            for (int y=0; y<matriz.length; y++){
	            	
	                matrizCopia[x][y] = matriz[x][y];

	                if (matrizCopia[x][y] < 10)	
	                    System.out.print("0" + matrizCopia[x][y] + "   ");
	                
	                else
	                    System.out.print(matrizCopia[x][y] + "   ");
	            }
	            System.out.println();
	        }
	    }
}