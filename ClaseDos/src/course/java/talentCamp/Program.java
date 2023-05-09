package course.java.talentCamp;

import java.util.ArrayList;
import java.util.List;

//import java.util.*;

public class Program {
	
	public static void CambiarValor(int n) {
		
		n=20;
		}
	public static void CambiarRectangulo(Rectangulo rec) {
		rec.base= 200;
		rec.altura=500;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("clase dos");
		
		int number = 10;
		int b=20;
		
		number=b;
		
		System.out.println(number);
		
		Rectangulo r = new Rectangulo();
		r.base= 10;
		r.altura=20;
		
		System.out.println(r);
		
		Rectangulo r2 = null;
		r2 = new Rectangulo();
		r2.altura =40;
		r2.base =20;
		
		System.out.println(r2.altura);
		System.out.println(r2.base);
		
		//CUIDADO CON LAS REFERENCIAS!!!
		r=r2;
		r2.base = 444;
		System.out.println(r.base);
		
		//SALE 444 PORQUE R DEJA DE APUNTAR A SU 10 Y 20 Y APUNTA A LO QUE APUNTA R2 Y COMO HEMOS CAMBIADO LA BASE SALE 444
		
		
		
		int miargumento= 300;
		CambiarValor(miargumento);
		System.out.println(miargumento);
		//Al ser dato primitivo no cambia ya que no se entera
		
		
		r.base= 888;
		CambiarRectangulo(r);
		System.out.println(r.base);
		//Si cambia porque al metodo le estamos pasando una referencia no un dato primitivo
		
		
		List<String> jediJava = new ArrayList<String>();
		//con CTRL+shift+O IMPORTANTISIMOOOO
		jediJava.add("Marcos");
		jediJava.add("Javier");
		jediJava.add("Borja");
		jediJava.add("Angello");
		jediJava.add("Jean");
		
		//ojo no es el que se usa
		String jediActual = null; //El string es tipo de dato especial, parece primitivo pero no lo es
									//Aca vemos que apunta a null
		
		
		System.out.println("Bienvenidos Jedis");
		for(int i=0; i<jediJava.size();i++) {
			jediActual = jediJava.get(i);
			System.out.println(jediActual);
			
		}
		
		
		
		
	}
	
	

}
