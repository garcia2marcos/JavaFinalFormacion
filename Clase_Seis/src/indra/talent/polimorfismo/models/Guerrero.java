package indra.talent.polimorfismo.models;

public class Guerrero extends Player {

	public Guerrero(String nombre) {
		super(nombre);
		
	}
	
	public void accion(Player enemigo) {
		//super.accion(enemigo);
		System.out.format("\n %s ataca %s y hace %d de daño \n",
				this.getNombre(),
				enemigo.getNombre(),
				this.getFuerza());
		
		
		enemigo.setHp(enemigo.getHp() - this.getFuerza());
	}

}
