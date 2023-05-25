package indra.talent.dependeciesInjection.constructor;

public class ConstructorInjectionDemo {
	
	public static void aTodoGas() {
		
		//Timepo de configuracion
		PartyService service = new PartyService(new DatabaseRespository());
		
		//Tiempo de ejecucion 
		service.haveFun();
	}

}
