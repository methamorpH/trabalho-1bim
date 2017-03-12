package com.mau.exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double num1, exp, resultado;
		
		num1 = 3;
		exp = 2;
		resultado = Math.pow(num1, exp);
		
		int resultadoFormatado = (int)resultado;
		System.out.println("O resultado de 3² vale: "+resultadoFormatado);

	}

}