package indra.talent.encapsulamiento.models;

public class Student extends Person{
	

	//private String name;
	//private int dni;
	//private String address;
	private boolean prefersFrontEnd;
	
	public Student(String name, int dni, String address) {
		//this.name =name;
		//this.dni=dni;
		//this.address=address;
		super(name,dni,address);
		this.prefersFrontEnd= false; //Inicializando atributo
		
	}
	
	public Student(String name, int dni, String address, boolean prefersFrontEnd) {
		super(name,dni,address);
		//this.name = name;
		//this.dni = dni;
		//this.address = address;
		this.prefersFrontEnd = prefersFrontEnd;
	}
	
	/*Source -> generate getters and setters
	public String getname() {
		return this.name;
	}
	
	//public void setName(String name) {	READONLY SOLO TIENE UN UNICO NOMBRE
		//this.name =name;
	//}
	
	public int getDni(){
		return dni;
	}
	//public void setDni(int dni) {	READONLY SOLO TIENE UN UNICO DNI
		//this.dni =dni;
	//}

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}*/

	public boolean getPrefersFrontEnd() {
		return prefersFrontEnd;
	}

	public void setPrefersFrontEnd(boolean prefersFrontEnd) {
		this.prefersFrontEnd = prefersFrontEnd;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		/*return this.getName() + "(Documento: " + this.getDni() + ")" + "\n" +
				"["+ this.getAddress() + "]" + "\n" +
		(this.prefersFrontEnd ? "Entusiasta de FrontEnd" : "Fanatico Backend");*/
		
		return String.format("%s (%d) \n [%s] \n %s",
				this.getName(),
				this.getDni(),
				this.getAddress(),
				(this.prefersFrontEnd ? "Entusiasta de FrontEnd" : "Fanatico Backend"));
	}
}
