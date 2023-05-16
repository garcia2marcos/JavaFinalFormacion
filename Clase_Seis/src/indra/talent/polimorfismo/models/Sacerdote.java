package indra.talent.polimorfismo.models;

public class Sacerdote /* es un */ extends Player {

	public Sacerdote(String nombre) {
		super(nombre);
		
	}
	public void accion(Player enemigo) {
		//super.accion(enemigo);
		System.out.format("\n %s cura a %s con %d puntos de vida \n",
				this.getNombre(),
				enemigo.getNombre(),
				this.getDestreza());
		
		enemigo.setHp(enemigo.getHp() + this.getDestreza());
	}

}
