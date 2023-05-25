package indra.talent.dependencyInjection.constructor.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import indra.talent.dependeciesInjection.constructor.MockRepository;
import indra.talent.dependeciesInjection.constructor.PartyService;

public class PartyServiceTest {
	
	@Test
	public void test() {
		PartyService service = new PartyService(new MockRepository());
		service.haveFun();
		
		assertEquals(true,true);
		
		
	}

}
