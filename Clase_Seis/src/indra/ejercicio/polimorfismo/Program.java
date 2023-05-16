package indra.ejercicio.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Animal> animales = new ArrayList<Animal>();
		
		Animal perro = new Perro();
		Animal vaca = new Vaca();
		Animal gato = new Gato();
		
		animales.add(perro);
		animales.add(vaca);
		animales.add(gato);
		
		/*perro.hacerSonido();
		vaca.hacerSonido();
		gato.hacerSonido();*/
		
		//animales.forEach(System.out::println);
		
		//jedis.forEach(mijedi -> System.out.println(mijedi));
		
		animales.forEach(mianimal -> mianimal.hacerSonido());
		
		for(Animal mianimal : animales) {
			mianimal.hacerSonido();
			
			}
	}

}
