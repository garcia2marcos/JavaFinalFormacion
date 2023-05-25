package indra.talent.dependenciesInjection.reflection;

public class PartyService {
	
	static private Class<? extends Repository> repositoryClass;
	
	private Repository repository;
	
	public static void registerRepositoryClass(Class<? extends Repository> repositoryClass) {
		
		PartyService.repositoryClass = repositoryClass;
	}
	
	public PartyService() {
		if (PartyService.repositoryClass==null) {
			throw new Error ("Te olvidaste de configurar el PartyService");
		}
		
		try {
			this.repository= (Repository)PartyService.repositoryClass.newInstance();
			}catch(Exception e) {
			
			throw new Error ("El constructor es privado");
		}
	}
	
	public void haveFun() {
		
		System.out.println("fiestaaa");
		System.out.println("pero luego se guarda en el repo");
		this.repository.save();
		
	}

}
