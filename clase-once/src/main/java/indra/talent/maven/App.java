package indra.talent.maven;

import java.util.Properties;

import com.google.gson.Gson;

import indra.talent.maven.models.Persona;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo Maven");
		
		String json = "{\"nombre\":\"pepe\",\"edad\":23}";
		
		Gson gson = new Gson();
		Properties p = gson.fromJson(json, Properties.class);
		System.out.println("El nombre es: "+p.getProperty("nombre"));
		System.out.println("La edad es: "+p.getProperty("edad"));
		
		System.out.println("--------------------------------");
		Persona people = gson.fromJson(json, Persona.class );
		System.out.println("El nombre es: "+people.getNombre());
		System.out.println("La edad es: "+people.getEdad());
		
		
		
	}

}
