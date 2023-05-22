package indra.talent.objetos;

public class CajaAhorro extends CuentaBancaria {

	CajaAhorro(Cliente propietario) {
		super(propietario);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void extraer(double monto) throws SaldoInsuficienteException{
        if (this.getSaldo() < monto) {
        	   throw new SaldoInsuficienteException();
        }
        
        this.movimientos.add(new Movimiento(-monto));
	}

	@Override
	public void extraer(double monto, String concepto) throws SaldoInsuficienteException {
        if (this.getSaldo() < monto) {
     	   throw new SaldoInsuficienteException();
        }
     
        this.movimientos.add(new Movimiento(-monto, concepto));
	}

}
