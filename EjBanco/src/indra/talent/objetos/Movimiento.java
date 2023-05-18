package indra.talent.objetos;

import java.time.LocalDate;

public class Movimiento {
	
	private LocalDate fecha;
	private double saldo;

	public Movimiento(double saldo) {
		super();
		this.saldo = saldo;
		this.fecha= LocalDate.now();
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double cantidad) {
		this.saldo= this.getSaldo()+cantidad;
	}
	
	public void Extraer(double cantidad) {
		this.saldo= this.getSaldo()- cantidad;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
