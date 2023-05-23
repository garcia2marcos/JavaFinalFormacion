

import static org.junit.Assert.assertEquals;

import java.util.Properties;

import org.junit.Test;

import com.google.gson.Gson;

import indra.talent.maven.models.Persona;

public class GsonTest {
	String json = "{\"nombre\":\"pepe\",\"edad\":23}";
	Gson gson = new Gson();
	
	
	@Test
	public void shouldReadProperties() {

		
		
		Properties p = gson.fromJson(json, Properties.class);
		assertEquals("pepe",p.getProperty("nombre") );
		assertEquals("23",p.getProperty("edad") );

	}
	
	@Test
	public void shouldReadPropertiesfFromPerson() {
		
		Persona persona = gson.fromJson(json, Persona.class );
		assertEquals("pepe",persona.getNombre() );
		assertEquals(23,persona.getEdad());
		
		
	}

}
