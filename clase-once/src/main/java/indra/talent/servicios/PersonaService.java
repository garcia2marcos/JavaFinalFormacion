package indra.talent.servicios;

import java.util.List;

import indra.talent.maven.models.Persona;
import indra.talent.persistencia.PersonaRepository;

public class PersonaService {
	
	private PersonaRepository repository;

	public PersonaService() {
		this.repository = new PersonaRepository();
	}
	
	public List<Persona> recuperarPersonas(){
		
		List<Persona> personas = this.repository.findAll();
		//Puedo eliminar personas
		//Puedo sacar las personas que no estan activas;
		
		return personas;
		
	}
	public void registrarPersonaNueva(Persona p) {
		
		if(p.getNombre()==null) {
			//throw new ValidationException ("Falta nombre")
			
		}
		this.repository.Save(p);
	}
	
	

}
ñ