package indra.talent.dependenciesInjection.ioc;

public class PartyService {
	private Repository repository;
	
	
	PartyService(Repository repository){
		this.repository=repository;
	}
	
	public void haveFun() {
		
		System.out.println("fiestaaa");
		System.out.println("pero luego se guarda en el repo");
		this.repository.save();
		
	}

}
