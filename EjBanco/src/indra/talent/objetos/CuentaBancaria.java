package indra.talent.objetos;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	
	private int numeroCuenta;
	private List<Movimiento> movimientos = new ArrayList<Movimiento>(); //Conviene usar un arraylist?
	private Cliente propietario;
	
	public CuentaBancaria(Cliente propietario) {
		super();
		this.propietario = propietario;
	}

	public double getSaldo() {
		throw new Error("not implemented");
	}
	
	public abstract void depositar();
	public abstract void extraer();
	
	
	
	

}
