package indra.talent.objetos;

import java.time.LocalDate;

public class Movimiento {
	
	private LocalDate fecha;
	private double monto; //Positivo, deposito, Negativo, extraccion;
	private String motivo;
    
    public Movimiento(double saldo) {
		super();
		this.monto = saldo;
		this.fecha = LocalDate.now();
		this.motivo = (saldo > 0)? "Deposito" : "Extracción";
	}
    
    public Movimiento(double saldo, String motivo) {
    	super();
		this.monto = saldo;
		this.fecha = LocalDate.now();
		this.motivo = motivo;
    }

	public double getMonto() {
		return monto;
	}

	public String getMotivo() {
		return motivo;
	}

	
	@Override
	public String toString() {
		return "...";
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	
}
