package com.mau.exercicio21;

public class Exercicio21 {
	
	    public static void main(String[] args) {
	    	
	        Integer [][][][] matriz = new Integer[10][10][10][10];
	        Integer contador = 1;

	        for (int x=0; x<10; x++){
	        	
	            for (int y=0; y<10; y++){
	            	
	                for (int w=0; w<10; w++){
	                	
	                    for (int z=0; z<10; z++){
	                    	
	                        matriz[x][y][w][z] = contador;
	                        contador++;
	                        System.out.print(matriz[x][y][w][z] + "    ");
	                    }
	                    System.out.println();
	                	}
	           }
	           
	           }
	    }
}