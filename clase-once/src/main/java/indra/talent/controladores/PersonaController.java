package indra.talent.controladores;

import java.util.List;

import indra.talent.maven.models.Persona;
import indra.talent.servicios.PersonaService;

public class PersonaController {
	
	private PersonaService service;
	
	public PersonaController() {
		this.service = new PersonaService();
		
	}
	
	public String mostrarTodas() {
		List<Persona> personas = this.service.recuperarPersonas();
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		//voy creando tabla
		//personas.forEach( ()-> /*...*/);
		builder.append("<table>");
		return builder.toString();
	}

}
