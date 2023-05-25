package indra.talent.dependenciesInjection.reflection;

public class ReflectionInjectionDemo {
	
	public static void aTodoGas() {
		
	//Configurar
	PartyService.registerRepositoryClass(DatabaseRespository.class);
	
	
	PartyService service = new PartyService();
	service.haveFun();
	}
	
	

}
