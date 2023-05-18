package indra.talent.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import indra.talent.lambda.models.Persona;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String frase = "Que la fuerza"+"te acompañe";
		StringBuilder builder  = new StringBuilder();
		
		builder.append("Que la fuerza");
		builder.append("este");
		builder.append("contigo");
		
		System.out.println(builder.toString());*/
		
		
		/*List<Persona> jedis = new ArrayList<Persona>();
		//List<Persona> mijedi = new LinkedList<Persona>();
		
		jedis.add(new Persona("Anakin", 178));
		jedis.add(new Persona("Yoda", 80));
		jedis.add(new Persona("Asoka", 165));
		jedis.add(new Persona("Luke", 165));*/
		
		List<Persona> jedis  = Arrays.asList(
				new Persona ("Anakin", 178),
				new Persona ("Yoda", 165),
				new Persona ("Asoka", 80),
				new Persona ("Luke", 198));
		
		System.out.println("La lista de jedis es: ");
		
		
		/*for(Persona mijedi : jedis) {
			System.out.println(mijedi.getNombre());
			
			}*/
		
		//Iterando con expresiones Lambda
		//jedis.forEach(mijedi -> System.out.println(mijedi));
		// es lo mismo  void mostrar que el for de arriba
		
		//iterando con expresion lambda de una manera particular ::
		//jedis.forEach(System.out::println);
		
		
		
		//Hacer un frgamento que calcule el numero mas alto
		
		/*int max = 0;
        for(int numero: numeros) {
            if(numero > max) {
                max = numero;
            }
        }
        
        System.out.println(max);
        
        int max1=0;
        
        for(int numero : numeros) {
        	
        	if (Integer.compare(numero,max1)>0) {
        		max1= numero;
        	}
        	
        }
        System.out.println("Max: "+max1);*/
        
        //int max = numeros.stream().max((a,b)->a.compareTo(b) ).orElse(0);  
		//int max = numeros.stream().max((a,b)->a-b ).orElse(0);
        //System.out.println("Max: "+max);
		
		// el jedi mas alto
		
		
		//Persona jediMasAlto = jedis.stream().max((a,b)->a.getCentAltura()-b.getCentAltura()).orElse(null);
		//Persona jediMasAlto = jedis.stream().max((a,b)->a.getCentAltura()-b.getCentAltura()).orElse(null);
		//System.out.println(jediMasAlto);
		
		
		//sumatoria lista de numeros
		
		/*int sumatorio = 0;
        for(int num: numeros) {
            sumatorio += num;
        }
        System.out.println(sumatorio);*/
        
        //System.out.println("Sumatoria: "+ numeros.stream().mapToInt(n->n).sum());
        
		//sumatoria de alturas
		//System.out.println(jedis.stream().mapToInt(Persona::getCentAltura).sum());
		
		
		//Media tradicional
		
		/*int sumatorio = 0;
        for(int num: numeros) {
            sumatorio += num;
        }
        
        int media = sumatorio / numeros.size();*/
        
		//System.out.printf("Media: %.2f", numeros.stream().mapToDouble(n-> (double)n).average().orElse(0));
		
		//la media de las alturas de los jedis
		//System.out.println("media de las alturas:" + jedis.stream().mapToInt(Persona::getCentAltura).average().orElse(0));
		
		//List<Integer> numeros =Arrays.asList(4,6,8,9,12,15,17,20,200,400,500);
		//Filtrar Elementos
		
		//numeros.stream().filter(n -> n>100).forEach(System.out::println);
		//numeros.stream().filter(n->n>100).forEach(System.out::println);
	   // numeros.stream().filter(n-> n>100).collect(Collectors.toList());
	    //List<Integer> numerosMayores100 = numeros.stream().filter(n-> n>100).collect(Collectors.toList());
	    
	    //System.out.println(numerosMayores100);
		
		//Mostrar la lista de jedis que miden mas de un metro
		//List<Persona> jedisAltos = jedis.stream().filter(jedi -> jedi.getCentAltura() > 100).collect(Collectors.toList());
				//jedisAltos.forEach(System.out::println);
		
		//Map
			//List<Integer> numeros =Arrays.asList(4,6,8,9,12,15,17,20,200,400,500);
		//numeros.stream().map(n-> n*2).forEach(System.out::println);
		//List<Integer> dobles = numeros.stream().map(n-> n*2).collect(Collectors.toList());
		
		
		//Convertir la lista de jedis en una lista de alturas(int). Luego mostrarla
		//List<Integer> alturas = jedis.stream().map(p -> p.getCentAltura()).collect(Collectors.toList());
		//alturas.forEach(System.out::println);
		
			
		
		//Reduce
		//Sumatoria con el reduce
		List<Integer> numeros = Arrays.asList(4,6,8,9,12,15,17,20,200,400,500);
			int sumatoria = numeros.stream().reduce(0,(acumulado, valorActual)-> acumulado+valorActual);
			System.out.println(sumatoria);
			
		//Dada una lista de estudiantes sacara los qye tenga calificacion superior a 90
			//List<Estudiantes> filtrados = estudiantes.stremam().filter(e-> getCalificacion>90).collect(Collectors.toList())
			//estudiantes.filter(e-> e.getCalificacion()>90).forEach(system.out::println);
			
		//Dado un array de enteros utiliza una expresion lambsda para encontrar el numero mas grande
			//int[] numeros = {1,2,3,4,5,6};
			//List<int> numeros = ...;
			
			//int max = numeros.stream().max((a,b)->(a-b)).ofElse(0)
			//max recibe una expresion que compara a y b
			//si a>b devuelve positivo
			//si a=b devuelve 0
			//si a<b devuelve negativo
			
			//int max = numeros.stream().reduce(0,(a,b)-> Math.max(a,b))
			//valorinicial 0
			//de 1,2,3
			//compara primero (0,1) y devuelve el mayor el 1
			// despues (1,2) y devuelve el 2 asi hasta que saca el mayor
			
			
			//Dad una liste de numeros enteros, utiliza una expresion lambda para obtener la suma de todos los pares
			//numeros.stream().filter(n-> n%2==0).maptoint(n->n).sum()
			//numeros.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b)
			
			
			//Dada una lista de objetos Producto con propiedades de nombre y precio, utiliza una expresion lambda para obtner el mas caro
			//productos.stream().max((a,b)-> a.getPrecio()-b.getPrecio()).orElse(0).
	}
	

}
