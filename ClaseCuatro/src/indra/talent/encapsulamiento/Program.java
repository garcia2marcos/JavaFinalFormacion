package indra.talent.encapsulamiento;

import indra.talent.encapsulamiento.models.*;
import indra.talent.utils.Console;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner in = new Scanner(System.in);
		
		
		//Student alumno = new Student();
		
		
		System.out.println("Bienvenidos al Talent Camp de Java");
		
		//System.out.println("¿Como te llamas?");
		//String nombre = in.nextLine();
		//alumno.name = in.nextLine();
		//alumno.setName(in.nextLine());
		//alumno.setName(Console.readString("¿Como te llamas?"));
		
		//System.out.println("¿Cual es su DNI?");
		//int dni = Integer.parseInt(in.nextLine());
		//alumno.dni = Integer.parseInt(in.nextLine());
		//alumno.setDni(Integer.parseInt(in.nextLine()));
		//alumno.setDni(Console.readInt("¿Cual es su DNI?"));
		
		//System.out.println("¿Donde vives?");
		//String direccion = in.nextLine();
		//alumno.setAdress(in.nextLine());
		//alumno.setAdress(in.nextLine());
		//alumno.setAdress(Console.readString("¿Donde vives?"));
		
		//System.out.println("¿Te gusta el front? (S/N)");
		//String respuesta = in.nextLine();
		//boolean prefiereFront = (respuesta.equalsIgnoreCase("S")); 
		//alumno.setPrefersFrontEnd((respuesta.equalsIgnoreCase("S")));
		//String respuesta = Console.readString("¿Te gusta el front? (S/N)");
		//alumno.setPrefersFrontEnd(respuesta.equals(respuesta));
		
		
		//AHORA CON CONSTRUCTOR OBLIGADO A USARLO
		System.out.println("Quien va a enseñar al curso");
		Teacher profesor = new Teacher(
			Console.readString("¿Como te llamas?"),
			Console.readInt("¿Cual es su DNI?"),
			Console.readString("¿Donde vives?"));
		
		
		System.out.println("Quien va a asistir al curso");
		Student alumno = new Student(
			Console.readString("¿Como te llamas?"),
			Console.readInt("¿Cual es su DNI?"),
			Console.readString("¿Donde vives?"));
		
		String respuesta = Console.readString("¿Te gusta el front? (S/N)");
		alumno.setPrefersFrontEnd(respuesta.equalsIgnoreCase("S"));
		
		//System.out.println("Bienevnido " +alumno.getname() + " al Talent Camp de Java");
		//System.out.println("Su documento es: "+ alumno.getDni()+" y vive en: "+ alumno.getAdress());
		
		// if (alumno.getPrefersFrontEnd()) {
			//System.out.println("Esperemos que seas Jedi de Front");
		//}else {
			//System.out.println("Esperemos que seas Jedi de Backend");
		//}
		System.out.println("------------------------------");
		System.out.println("El profesor es: ");
		System.out.println(profesor);
		System.out.println("El Alumno es: ");
		System.out.println(alumno);
		
		//Student Marcos = new Student("Marcos", 48145244, "Constitucion");
		//System.out.println(Marcos);

		ProductoElectrónico movil = new ProductoElectrónico("movil", 245, 2, "xiaomi");
		
		System.out.println(movil);
		
		movil.vender(1);
	}

}
