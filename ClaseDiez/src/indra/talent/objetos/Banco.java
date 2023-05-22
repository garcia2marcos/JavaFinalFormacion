package indra.talent.objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	
	private List<CuentaBancaria> cuentas =new ArrayList<CuentaBancaria>();
	
	
	public List<CuentaBancaria> getCuentas() {
		return Collections.unmodifiableList(cuentas);
	}
   
	public CuentaBancaria crearCajaDeAhorrro(Cliente cliente) {
		CajaAhorro cuenta = new CajaAhorro(cliente);
		this.cuentas.add(cuenta);
		return cuenta;
	}
	
	public CuentaBancaria crearCuentaCorriente(Cliente cliente) {
		CuentaCorriente cuenta = new CuentaCorriente(cliente);
		this.cuentas.add(cuenta);
		return cuenta;
	}
	
	public CuentaBancaria buscarCuenta(int numeroCuenta) {		
	  return this.cuentas.stream().filter(c -> c.getNumeroCuenta() == numeroCuenta).findFirst().orElse(null);	
	}
	
	
	}
	

