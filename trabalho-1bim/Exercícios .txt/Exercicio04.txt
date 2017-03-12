package com.mau.exercicio04;

public class Exercicio04 {

public static void main(String[] args) {
		
		double num1, exp, resultado;
		
		num1 = 3;
		exp = num1;
		resultado = Math.pow(num1, exp);
		
		int resultadoFormatado = (int)resultado;
		System.out.println("O resultado de 3³ vale: "+resultadoFormatado);

	}

}