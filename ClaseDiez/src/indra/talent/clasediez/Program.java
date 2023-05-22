package indra.talent.clasediez;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Manejo de fechas
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha);
		//System.out.println(ZoneId.fecha);
		
		LocalDateTime fechayhora = LocalDateTime.now();
		System.out.println(fechayhora);
		
		LocalDate miFecha = LocalDate.of(1999, Month.JULY, 12);
		System.out.format("Mi cumpleaños es: el dia %d de %d del año %d ",
				miFecha.getDayOfMonth(),
				miFecha.getMonthValue(),
				miFecha.getYear());
		
		LocalDate masUnDia = miFecha.plusDays(1);
		
		System.out.println();
		System.out.println(masUnDia);
		
		Period periodo = Period.between(miFecha, fecha);
		System.out.format("Han pasado %d años, %d meses, %d dias desde que naci", 
				periodo.getYears(),
				periodo.getMonths(),
				periodo.getDays());
		
		
		//Manejo de Strings
		
		System.out.println("\n Uso del SPLIT");
		String texto = "Hola casa y auto cuantas casa hay en mi auto";
		List<String> palabras1 = Arrays.asList(texto.split(" "));
		palabras1.forEach(System.out::println);
		
		
		//Diccionarios
		Map<String,String> diccionario = new HashMap<>();
		diccionario.put("Casa", "Lugar donde vive la gente");
		
		
		
		if (!diccionario.containsKey("auto")) {
			diccionario.put("auto", "vehiculo que te lleva de un lado a otro");
			
			
		}
		
		
		
		for (var entrada: diccionario.entrySet()) {
			System.out.println(entrada.getKey()+" : "+ entrada.getValue());
		}
		

		
		  String mitexto = "Este es un ejemplo de texto, ejemplo de palabras.";

	        
	        Map<String, Integer> contadorPalabras = new HashMap<>();
	        List<String> palabras = Arrays.asList(mitexto.split(" "));

	        for (String palabra : palabras) {
	            if (contadorPalabras.containsKey(palabra)) {
	                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
	            } else {
	                contadorPalabras.put(palabra, 1);
	            }
	        }

	        for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
	            String palabra = entry.getKey();
	            int ocurrencia = entry.getValue();
	            System.out.println("Palabra: " + palabra + ", Ocurrencia: " + ocurrencia);
	        }
	    }
}


