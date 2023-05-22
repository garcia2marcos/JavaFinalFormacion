package indra.talent.tests;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import indra.talent.objetos.Cliente;

public class ClienteTest {
	
	@Test
	public void shouldValidateClienteCreation(){
		
		assertThrows(AssertionError.class,()->Cliente.builder().setNombre("mal").build());
		assertThrows(AssertionError.class,()->Cliente.builder().setApellido("mal").build());
		assertThrows(AssertionError.class,()->Cliente.builder().setIdentificador(1).build());
		assertThrows(AssertionError.class,()->Cliente.builder().setNombre("mal").setApellido("mal").build());
		
	}

}
