package indra.utils;

import java.util.Scanner;

public class Consola {
	public static boolean esNumero(String numero) {
		
		//quiero que haga captura de excepciones
        //y me devuelva si el string ingresado es 
		
		try {
			Integer.parseInt(numero);
			return true;
		}catch(NumberFormatException e) {
			
			return false;
			
		}
		
	}

	
	public static  int  readInt() {
		//lea un entero	
		//si el usuario ingresa otra cosa que no sea numero 
		//se lo vuelve a preguntar
		// usar while
		
		String numero= null;
		Scanner in = new Scanner (System.in);
		do {
			
			System.out.println("ingrese numero");
			numero = in.nextLine();
			
			
		}while (!esNumero(numero));
				return Integer.valueOf(numero);
		
	}
	
	public static  int  readInt(String prompt) {
		//lea un entero	
		//si el usuario ingresa otra cosa que no sea numero 
		//se lo vuelve a preguntar
		// usar while
		
		String numero= null;
		Scanner in = new Scanner (System.in);
		do {
		
			System.out.println(prompt);
			numero = in.nextLine();
			
			
		}while (!esNumero(numero));
				return Integer.valueOf(numero);
		
	}
	
}
