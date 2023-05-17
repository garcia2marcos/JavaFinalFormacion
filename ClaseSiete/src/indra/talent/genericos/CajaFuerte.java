package indra.talent.genericos;

public class CajaFuerte <T>{
	private String password;
	private T valor;
	
	public CajaFuerte(String password) {
	this.password=password;	
	}
	
	public void guardarValor(T valor) {
		this.valor=valor;
	}
	
	public T leerValor(String password) {
		if (password.equals(this.password)) {
			return this.valor;
		}
		
		throw new Error ("Acceso no autorizado");
	}

}
