package indra.talent.database.services;

import java.util.List;

import indra.talent.database.models.Persona;
import indra.talent.database.persistence.PersonaRepository;
import lombok.Getter;
import lombok.Setter;

public class PersonaService {
	
	@Getter @Setter
	private PersonaRepository repository;
	
	public List<Persona> cracksDeJava(){
		return this.repository.findAll();
	}

}
