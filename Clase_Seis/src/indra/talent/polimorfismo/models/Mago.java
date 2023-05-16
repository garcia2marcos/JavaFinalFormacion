package indra.talent.polimorfismo.models;

public class Mago extends Player{
	
	private int poderMagico;
	private int mana;

	public Mago(String nombre) {
		super(nombre);
		this.poderMagico= 10;
		this.mana=100;
		
	}
	public void accion(Player enemigo) {
		//super.accion(enemigo);
		System.out.format("\n %s tira un hechizo a %s y modifica sus stats\n ",
				this.getNombre(),
				enemigo.getNombre());
		
		if (mana>poderMagico) {
			enemigo.setModFuerza( - this.poderMagico);
			this.mana -= poderMagico;
		}
		
	}
	
	@Override
	public void finalizarTurno() {
		// TODO Auto-generated method stub
		super.finalizarTurno();
		this.mana =+ 10;
	}

}
