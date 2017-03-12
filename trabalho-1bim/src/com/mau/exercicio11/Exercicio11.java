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
	 
	        if (validarData(entradaUsuario)){
	            imprimeMesExtenso(entradaUsuario);
	        }
	            
	    }
	 
	    private static void imprimeMesExtenso(String entradaUsuario){
	        char[] charData = new char[10];
	        for (int i=0; i < 10; i++){
	            charData[i] = entradaUsuario.charAt(i);
	        }
	        	String mesCompleto = charData[3] + "" +  charData[4];
	        	String dataCompleta = charData[0] + "" + charData[1];
	        	String anoCompleto = charData[6] + "" + charData[7] + "" + charData[8] + "" + charData[9];
	 
	        Integer mesInteger = Integer.valueOf(mesCompleto);
	        	String mesConvertidoExtenso = mesExtenso(mesInteger);
	 
	        System.out.println(dataCompleta + " de " + mesConvertidoExtenso + " de " + anoCompleto);
	    }
	 
	    private static boolean validarData(String entradaUsuario){
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