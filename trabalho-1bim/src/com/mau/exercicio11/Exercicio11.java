package com.mau.exercicio11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
	 
	public class Exercicio11 {
	 
	    public static void main(String[] args){
	    	
	    	Scanner input = new Scanner(System.in);
	   	 
	        System.out.println("Digite a data no formato: DD/MM/AAAA");
	        String entradaUsuario = input.nextLine();
	 
	        if (checaData(entradaUsuario)){
	            printMesExtenso(entradaUsuario);
	        }
	            
	    }
	 
	    private static void printMesExtenso(String entradaUsuario){
	        char[] charData = new char[10];
	        for (int x=0; x < 10; x++){
	            charData[x] = entradaUsuario.charAt(x);
	        }
	        	String mesFormatado = charData[3] + "" +  charData[4];
	        	String dataFormatada = charData[0] + "" + charData[1];
	        	String anoFormatado = charData[6] + "" + charData[7] + "" + charData[8] + "" + charData[9];
	 
	        Integer mesInteger = Integer.valueOf(mesFormatado);
	        	String mesConvertidoExtenso = mesExtenso(mesInteger);
	 
	        System.out.println(dataFormatada + " de " + mesConvertidoExtenso + " de " + anoFormatado);
	    }
	 
	    private static boolean checaData(String entradaUsuario){
	        Date data = null;
	 
	        if (entradaUsuario.length() < 10 || entradaUsuario.length() > 10){
	            System.out.println("Data Inválida. Digite novamente!");
	            System.exit(0);
	        }
	 
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        try {
	            simpleDateFormat.setLenient(false);
	            data = simpleDateFormat.parse(entradaUsuario);
	        } catch (ParseException e) {
	            System.out.println("Data Inválida. Digite novamente!");
	            System.exit(0);
	        }
	        return true;
	    }
	 
	    private static String mesExtenso(Integer month){
	        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	        return mes[month  -1];
	    }
}