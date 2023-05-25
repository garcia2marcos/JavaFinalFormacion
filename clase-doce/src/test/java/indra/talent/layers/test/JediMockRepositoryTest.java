package indra.talent.layers.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import indra.talent.layers.models.Jedi;
import indra.talent.layers.persintance.JediMockRepository;
import indra.talent.layers.persintance.NotFoundException;

public class JediMockRepositoryTest {
	
	/*@Test
	void shouldThrowAnExceptionIfNotFound() {
		JediMockRepository repo = new JediMockRepository();
		assertThrows(NotFoundException.class,()->repo.findById(28));
	}
	
	@Test 
	void shouldSaveAndThenFirst() throws NotFoundException{
		
		JediMockRepository repo = new JediMockRepository();
		Jedi joda = new Jedi("Joda", 10000, Color.GREEN);
		repo.save(joda);
		Jedi jodaRenacido = repo.findById(1);
		assertEquals(joda.getNombre(), jodaRenacido.getNombre());
}*/
	}


