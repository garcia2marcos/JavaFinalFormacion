package indra.talent.dependenciesInjection.ioc;

public class IocInjectionDemo {
	
	public static void aTodoGas() {
		//Tiempo de configuracion
		BeanFactory factory = new BeanFactory();
		factory.registerRepository(new DatabaseRespository());
		
		//Tiempo de ejecucion
		PartyService service = factory.createPartyService();
		service.haveFun();
		}

}
