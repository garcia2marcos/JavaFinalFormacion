package indra.talent.relaciones;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import indra.talent.composite.*;

import org.mozilla.javascript.*;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2+2*3
		
		Operacion calculo = new Suma(
				new Valor(2),
				new Multiplicacion(new Valor(2), new Valor(3))
				);
		
		System.out.println("2+2*3="+calculo.calcular());
		
		//6*5+3*8
		
		Operacion calculo1 = new Suma(
				new Multiplicacion(new Valor(6), new Valor(5)),
				new Multiplicacion(new Valor(3), new Valor(8))
				);
		
		System.out.println("6*5+3*8="+calculo1.calcular());
	
		
		//5+3*8+4*3
		Operacion calculo2 = new Suma(5,
				new Suma(
	                new Multiplicacion(3, 8),
	                new Multiplicacion(4, 3)
	            )
	        );
		System.out.println("5+3*8+4*3="+calculo2.calcular());
		
		//TRUCO JEDI LADO OSCURO
		String expresion = "5+3*8+4*3";
		//ScriptEngineManager manager = new ScriptEngineManager();
		//ScriptEngine engine = manager.getEngineByName("js");
		
		//try {
			//var result = engine.eval(expresion);
			//System.out.println("El resultado es: "+result);
			
		//}catch(Exception ex) {
			//System.out.println("Error al ejecutar expresion: "+expresion+ ex.getMessage());
			
		//}
		
		Context jscontext = Context.enter();
		
		try {
			var res= jscontext.evaluateString(jscontext.initSafeStandardObjects(),
					expresion,
					"Calculo",
					1,null);
			System.out.println("El resultado es: ");
			System.out.println(expresion+"="+res);
			
		}finally {
			Context.exit();
		}
		 
	}

}
