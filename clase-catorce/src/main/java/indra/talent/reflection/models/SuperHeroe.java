package indra.talent.reflection.models;

public class SuperHeroe {
	
	private String nombre;
	private String habilidad;
	private  String alturaCm;
	private  String peso;
	
	public SuperHeroe() {
		super();
	}

	public SuperHeroe(String nombre, String habilidad, String alturaCm, String peso) {
		super();
		this.nombre = nombre;
		this.habilidad = habilidad;
		this.alturaCm = alturaCm;
		this.peso = peso;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(String alturaCm) {
		this.alturaCm = alturaCm;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void decirSuFrase() {
		System.out.println("El bien vencera siempre");
		
	}
	
	public void hacerObrasDeBien() {
		System.out.println("Ayudando a los desposeidos");
	}
	
	public void salvarElMundo() {
		System.out.println("Salvamos de nuevo el mundo");
	}

}
