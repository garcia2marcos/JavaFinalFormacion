package indra.talent.polimorfismo.models;

public abstract class Player {
	
	private String nombre;
	private int hp;
	private int fuerza;
	private int modFuerza;
	private int destreza;
	
	//temporal
	//private int tipoJugador = 1; // 1 guerrero 2 sacedorte 3 mago
	
	
	public Player(String nombre) {
		this.nombre= nombre;
		this.hp=50;
		this.fuerza=50;
		this.destreza=50;
		this.modFuerza=0;
	}
	
	public boolean estaVivo() {
		return (this.hp>0);
	}

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	public int getFuerza() {
		return fuerza;
	}

	protected void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	protected void setModFuerza(int modFuerza) {
		this.modFuerza = modFuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	protected void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	
	public abstract void accion(Player enemigo);
	
	public void finalizarTurno() {
		this.modFuerza=0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Nuestro personaje %s, llamado %s \n Tiene una salud: %d \n Tiene una destreza: %d \n Tiene fuerza : %d"  ,
				this.getClass().getSimpleName(),
				this.nombre,
				this.hp,
				this.destreza,
				this.fuerza);
	}

}
