import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import indra.utils.Consola;

public class Program {
	
	static final int CANTIDAD_OPORTUNIDADES =5;
	static final int MAX_VALUE = 100;
	
	public static void ejemploBufferedReader() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Ingrese su nombre :");
			String nombre = reader.readLine();
			System.out.println("Tu edad: ");
			String edadInt = reader.readLine();
			
			
			//Agregar que le pregunte tambien la edad
			//Hacer conversion
			int edad = Integer.parseInt(edadInt); // para pasar la conversion
			
			System.out.println("Tu nombre es: "+ nombre+ " y tu edad es: "+edad);
			
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println(e.getMessage());
			
		}finally {System.out.println("cerrando bufferedReader");
		// CON EL FINALLY SIEMPRE VA A EJECUTAR ESTE CACHO AUNQUE ANTES HAYA EXCEPCIONES
			reader.close();
			}
		}
	
	
	public static void ejemploScanner() {
		try (Scanner in  = new Scanner(System.in)){;
		System.out.println("Su nombre es ...");
		String nombre1 = in.nextLine();
		System.out.println("Y tu edad es ...");
		int edad1 = in.nextInt();
		System.out.println("mi nombre es: "+nombre1+"y mi edad es :"+edad1);
	}// con el try se cierra solo
		//CON RUNTIMEEXCEPTION NO HACE FALTA TRY CATCH
}
	
	public static void adivinanza(){
		Random r = new Random();
		int aleatorio = r.nextInt(1,MAX_VALUE);
		System.out.println(aleatorio);
		
		
		//programar el juego de adivinar el numero
		//utilizar clase consola
		int turnoActual = 1;
		Boolean TeQuedasteSinVidas= false;	

		while((!TeQuedasteSinVidas)&& (turnoActual<=CANTIDAD_OPORTUNIDADES)) {
			int minumero = Consola.readInt("Ingrese su numero");
	
		if (minumero>aleatorio) {
			System.out.println("El numero es MENOR");
			
		}else if (minumero<aleatorio) {
			System.out.println("El numero es MAYOR");
			
		}else {
			System.out.println("ENHORABUENA ACERTASTE");
			TeQuedasteSinVidas = true;
			
			}
		
			turnoActual++;
		
		}
		
		if(!TeQuedasteSinVidas){
			System.out.println("TE QUEDASTE SIN VIDAS");
			}
		}
		
	
	public static boolean esPrimo(int numero) {
		
		
		
		if(numero%2==0) {
			System.out.println(numero);
			return false;
			
		}else {
			System.out.println(numero);
			return true;
		}
		
	}
	
	public static void main(String[] args){
		// SI PONEMOS THROWS NO HACE FALTA TRY CATCH
		
		
		//try {
			//ejemploBufferedReader();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
		
		//System.out.println(numero);
		
		//adivinanza();
		
		//boolean primo = esPrimo(11);
		//System.out.println(primo);
		
		  int numero = Consola.readInt("Ingrese un numero y diremos si es primo");
	        boolean esPrimo = true;
	        for (int i=2; i<numero/2; i++) {
	            if ((numero % i)==0) {
	                esPrimo = false;
	                break; //EL lado oscuro de la programacion!
	            }
	        }
	        if (esPrimo) {
	            System.out.println("El numero es Primo");
	        }else {
	            System.out.println("El numero no es primo");
	        }
	
	}
}


