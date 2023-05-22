package indra.talent.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import indra.talent.objetos.Banco;
import indra.talent.objetos.Cliente;
import indra.talent.objetos.CuentaBancaria;
import indra.talent.objetos.SaldoInsuficienteException;

class CuentaBancariaTest {
	Cliente demoCliente;
	@BeforeEach
	public void before() {
		System.out.println("Antes de ejecutar todos los test de esta clase");
		
		demoCliente = Cliente.builder().
				setIdentificador(123).
				setNombre("Marcos").
				setApellido("Garcia").
				build();
		
	}

	@Test
	void shouldAutoIncrementCuentaBancariaNumero() {
		
		Banco banco = new Banco();
		
		//Cliente democliente = new Cliente(123,"Marcos", "Garcia");
		
		/*Cliente demoCliente = Cliente.builder().
				setIdentificador(123).
				setNombre("Marcos").
				setApellido("Garcia").
				build();*/
		CuentaBancaria cuentaUno = banco.crearCuentaCorriente(demoCliente);
		CuentaBancaria cuentados = banco.crearCuentaCorriente(demoCliente);
		
		assertTrue(cuentaUno.getNumeroCuenta()< cuentados.getNumeroCuenta());
		assertEquals(1,cuentaUno.getNumeroCuenta());
		assertEquals(2,cuentados.getNumeroCuenta(),"La cuenta dos no tiene numero dos");
	}
	
	@Test
	void ShouldNotBeAbleToExtractMoreFromCajaDeAhorro() {
		Banco banco = new Banco();
		
		/*Cliente demoCliente = Cliente.builder().
				setIdentificador(123).
				setNombre("Marcos").
				setApellido("Garcia").
				build();*/
		CuentaBancaria cajaDeAhorro = banco.crearCajaDeAhorrro(demoCliente);
		cajaDeAhorro.depositar(100);
		
		assertTrue(cajaDeAhorro.getSaldo()>0);
		
		assertThrows(SaldoInsuficienteException.class,()-> cajaDeAhorro.extraer(200));
		 
	}
	@Test
	void shouldExtracrtCorrectly() throws SaldoInsuficienteException {
		Banco banco = new Banco();
		/*Cliente demoCliente = Cliente.builder().
				setIdentificador(123).
				setNombre("Marcos").
				setApellido("Garcia").
				build();*/
		CuentaBancaria cajaDeAhorro = banco.crearCajaDeAhorrro(demoCliente);
		cajaDeAhorro.depositar(100);
		cajaDeAhorro.extraer(50);
		
		assertEquals(50, cajaDeAhorro.getSaldo());
		
		
	}
	
	

}
