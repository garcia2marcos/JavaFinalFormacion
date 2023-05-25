package indra.talent.dependenciesInjection.field;

import indra.talent.dependeciesInjection.constructor.Repository;

public class PartyService {
	private Repository repository;
	
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public void haveFun() {
		
		System.out.println("fiestaaa");
		System.out.println("pero luego se guarda en el repo");
		this.repository.save();
		
	}

}
