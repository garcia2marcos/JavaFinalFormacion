package indra.talent.interfaces;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Area> escenario =  Arrays.asList(
				new Circulo(10.0),
				new Triangulo(12.0,15.0,16.36,16.36),
				new Rectangulo(10,10),
				new Planta());
		
		System.out.println("El area total de mi dibujo es: ");
		//System.out.println("Sumatoria: "+ numeros.stream().mapToInt(n->n).sum());
		
		System.out.println("Area total: "+ escenario.stream().mapToDouble(n->n.calcularArea()).sum());
		
		System.out.println("El perimetro total de mi dibujo es: ");
		
		//System.out.println("Perimetro total: "+ escenario.stream().mapToDouble(n->n.calcularPerimetro()).sum());
		
		double perimetroTotal = 0.0;
		for(Area c: escenario){
			if (c instanceof Perimetro) {
				perimetroTotal += ((Perimetro)c).calcularPerimetro();
						
			}
			
		}
		System.out.println("Perimetro total : "+ perimetroTotal);
			
		double pTotal= escenario.stream().filter(Perimetro.class::isInstance).map(Perimetro.class::cast).mapToDouble(p->p.calcularPerimetro()).sum();
		System.out.println("Perimetro total: "+pTotal);
		
		//escenario.forEach(System.out::println);
		List<Figura> figuras = escenario.stream().filter(Figura.class::isInstance).map(Figura.class::cast).collect(Collectors.toList());
		
		Collections.sort(figuras);
		
		figuras.forEach(System.out::println);
	}

}
