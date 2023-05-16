package indra.talent.lambda.models;

public class Persona {
	
	private String nombre;
	private int centAltura;
	
	public Persona(String nombre, int centAltura) {
		super();
		this.nombre = nombre;
		//Se pone asi para que recoja las excepciones del set
		this.setCentAltura(centAltura);
	}

	public int getCentAltura() {
		return centAltura;
	}

	public void setCentAltura(int centAltura) {
		
		if (centAltura>300) throw new Error ("Imposible altura");
		if (centAltura<0) throw new Error ("No puedes medir menos de 0");
		
		this.centAltura = centAltura;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNombre();
	}
	
	
}
