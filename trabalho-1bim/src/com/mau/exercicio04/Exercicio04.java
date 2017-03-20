package com.mau.exercicio04;
import java.util.Scanner;

public class Exercicio04 {

public static void main(String[] args) {
	
	 	Scanner input = new Scanner(System.in);
		
		Integer num1;
		
		System.out.println("Digite o número:");
		num1 = input.nextInt();
		
		System.out.println("O resultado de "+num1+" elevado à "+num1+" é: "+exp(num1,num1));
		
}
	
static Integer exp(Integer base, Integer exp1){
	
		Integer resultado = 1;
		if(exp1==0) return 1;
	
		for(int x=1; x<=exp1; x++) resultado*=base;
		return resultado;
	
	}

}