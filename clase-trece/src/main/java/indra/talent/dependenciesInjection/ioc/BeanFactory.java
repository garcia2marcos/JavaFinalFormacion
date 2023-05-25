package indra.talent.dependenciesInjection.ioc;

public class BeanFactory {
	
	Repository repository;
	
	public void registerRepository(Repository repo){
		this.repository=repo;
		
	}
	
	public PartyService createPartyService() {
		return new PartyService(this.repository);
		
	}

}
