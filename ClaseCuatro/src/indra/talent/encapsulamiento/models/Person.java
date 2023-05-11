package indra.talent.encapsulamiento.models;

public class Person {
	//Podriamos poner protected para que las clases hijas puedan
	//utilizar los atributos sin getName() simplemente con this.name
	private String name;
	private int dni;
	private String address;
	
	public Person(String name, int dni, String address) {
		super();
		this.name = name;
		this.dni = dni;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getDni() {
		return dni;
	}
	
}
