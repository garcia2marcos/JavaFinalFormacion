package indra.talent.dependeciesInjection.constructor;

public class PartyService {
	private Repository repository =null;
	
	
	
	


	public PartyService(Repository repo) {
		this.repository = repo;
	}






	public void haveFun() {
		
		assert this.repository!=null;
		System.out.println("fiestaaa");
		System.out.println("pero luego se guarda en el repo");
		this.repository.save();
		
	}

}
