package indra.talent.dependenciesInjection.field;

import indra.talent.dependeciesInjection.constructor.DatabaseRespository;

public class FieldOnjectionDemo {

public static void aTodoGas() {
		
		//Timepo de configuracion
	PartyService service = new PartyService();
	service.setRepository(new DatabaseRespository());
		
		//Tiempo de ejecucion 
		service.haveFun();
	}
}
