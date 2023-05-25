package indra.talent.dependenciesInjection;

import indra.talent.dependeciesInjection.constructor.ConstructorInjectionDemo;
import indra.talent.dependenciesInjection.field.FieldOnjectionDemo;
import indra.talent.dependenciesInjection.ioc.IocInjectionDemo;
import indra.talent.dependenciesInjection.reflection.ReflectionInjectionDemo;

public class App {

	public static void main(String[] args) {
		
		ConstructorInjectionDemo.aTodoGas();
		
		FieldOnjectionDemo.aTodoGas();
		
		ReflectionInjectionDemo.aTodoGas();
		
		IocInjectionDemo.aTodoGas();

	}

}
