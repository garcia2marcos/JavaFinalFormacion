package indra.talent.encapsulamiento.models;

public class Teacher extends Person {
	
	private String prefersLanguage;
	
	public Teacher(String name, int dni, String address) {
		
		super(name,dni,address);
		this.prefersLanguage= "Java"; //Inicializando atributo
		
	}
	
	public Teacher(String name, int dni, String address, String prefersLanguage) {
		
		super(name,dni,address);
		this.prefersLanguage = prefersLanguage;
	}
	
	
	public String getPrefersLanguage() {
		return prefersLanguage;
	}

	public void setPrefersLanguage(String prefersLanguage) {
		this.prefersLanguage = prefersLanguage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + "(Documento: " + this.getDni() + ")" + "\n" +
				"["+ this.getAddress() + "]" + "\n" +
				"Especialista en "+ this.prefersLanguage;
	}
}
