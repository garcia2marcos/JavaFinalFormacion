package indra.talent.polimorfismo;

import java.util.ArrayList;
import java.util.List;

import indra.talent.polimorfismo.models.Guerrero;
import indra.talent.polimorfismo.models.Mago;
import indra.talent.polimorfismo.models.Player;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player excalibur = new Guerrero("Excalibur");
		Player batman = new Guerrero ("Batman");
		Player thanos = new Mago ("Thanos");
		
		List<Player> personajes = new ArrayList<Player>();
		
		personajes.add(excalibur);
		personajes.add(batman);
		personajes.add(thanos);
		
		
		// Con protected el usuario no puede modificar los stats
		//thanos.setHp(0);
		
		//Comienzo turno
		System.out.println("Comienzo del turno");
		personajes.forEach(System.out::println);
		
		batman.accion(excalibur);
		thanos.accion(batman);
		
		personajes.forEach(p-> p.finalizarTurno());
		
		//Fin turno
		System.out.println("------------------------");
		System.out.println("Fin del turno");
		System.out.println("Los que quedaron vivos");
		
		personajes.stream().filter(n -> n.estaVivo()).forEach(System.out::println);
		//numeros.stream().filter(n -> n>100).forEach(System.out::println);
		//personajes.forEach(System.out::println);
	}

}
