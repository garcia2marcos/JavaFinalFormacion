package indra.talent.objetos;

public class Cliente {
	private int identificador;
	private String nombre;
    private String apellido;
    
	/*public Cliente(int identificador, String nombre, String apellido) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellido = apellido;
	}*/
    
    //Hice el constructor privado por lo que solo el builder puede crear un cliente
    private Cliente () {
    	super();
    }
    
	public int getIdentificador() {
		return identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	//Inner class
	public static class ClienteBuilder{
		private int identificador =0;
		private String nombre = null;
	    private String apellido= null;
	    
		public ClienteBuilder setIdentificador(int identificador) {
			this.identificador = identificador;
			return this;
		}
		public ClienteBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		public ClienteBuilder setApellido(String apellido) {
			this.apellido = apellido;
			return this;
		}
		
		public Cliente build() {
			//Tengo que asegurarme de crear un constructor de cliente seguro
			assert this.nombre !=null;
			assert this.apellido!=null;
			assert this.identificador>0;
			
			Cliente c = new Cliente();
			c.identificador = this.identificador;
			c.nombre=this.nombre;
			c.apellido=this.apellido;
			return c;
		}
		
	}
	
	//dentro de cliente
	public static ClienteBuilder builder() {
		return new ClienteBuilder();
	}
}
