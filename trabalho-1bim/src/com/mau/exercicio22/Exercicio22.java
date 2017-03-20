package com.mau.exercicio22;

public class Exercicio22 {

	public static void main(String[] args) {
		
        Integer[] vetor = new Integer[10];

        for (int x=0; x<vetor.length; x++)
            vetor[x] = x+1;

        vetorCopia(vetor);
    }

    private static void vetorCopia(Integer[] vetor) {
    	
        Integer[] vetorCopia = new Integer[10];

        for (int x=0; x<vetor.length; x++){
        	
            vetorCopia[x] = vetor[x];
            System.out.println(vetorCopia[x]);
        }
    }
}