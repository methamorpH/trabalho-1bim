package com.mau.exercicio19;
import java.util.Scanner;

public class Exercicio19 {
	
    public static void main(String[] args) {
    	
        for (int saida : numPrimo()) {
            System.out.println(saida);
        }
    }
    
    private static int[] numPrimo() {
    	
    	Integer entradaUsuario = 0;
    	
    	Scanner input = new Scanner (System.in);
        System.out.println("\nDigite um valor e à partir dele os 10 primeiros números primos serão impressos:");
        entradaUsuario = input.nextInt();
        
        Integer entrada = entradaUsuario;
        Integer resto = 0, contador = 0;
        int numSaida[] = new int[10];
        
        while (contador < 10) {
        	
            for (int x = 2; x<entrada; x++) {
                resto = entrada % x;
                if (resto == 0) {
                    break;
                }
            }
            
            if (resto != 0) {
                numSaida[contador] = entrada;
                contador++;
            }
            
            entrada++;
        }
        
        return numSaida;
    }
}