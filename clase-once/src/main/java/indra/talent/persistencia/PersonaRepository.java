package indra.talent.persistencia;

import java.util.ArrayList;
import java.util.List;

import indra.talent.maven.models.Persona;

public class PersonaRepository {
	public List<Persona> findAll(){
		//Recupera todas las personas de la base de datos
		
		return new ArrayList<Persona>();
		
	}
	
	public void Save (Persona p) {
		//graba persona en la persistencia, la base de datos, un archivo, lo que sea.
		
		
	}
	
	public void Update(Persona p) {
		
	}
	
	public void Delete(Persona p) {
		//Borro persona
	}
}
