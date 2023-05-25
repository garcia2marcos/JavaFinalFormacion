package indra.talent.dependencyInjection.reflection.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import indra.talent.dependenciesInjection.reflection.MockRepository;
import indra.talent.dependenciesInjection.reflection.PartyService;

public class PartyServiceTest {
	
	@Before
    public void configure() {
        // tiempo de configuracion (usar MOCK no estamos en produccion al hacer tests)
        PartyService.registerRepositoryClass(MockRepository.class);
    }
    
    @Test
    public void test() {
        //tiempo de ejecucion
        PartyService service = new PartyService();
        service.haveFun();
        
        assertEquals(true, true);  // asserts correspondientes
    }

}
