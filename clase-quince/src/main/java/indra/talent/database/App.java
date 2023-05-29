package indra.talent.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import indra.talent.database.models.Persona;
import indra.talent.database.services.PersonaService;


public class App {

	public static void main(String[] args) {
		System.out.println("JDBC es la hostia!");
        Connection conn = null;
        ApplicationContext iocContainer=null;
    
        try {
            try {
            	
            	iocContainer = new FileSystemXmlApplicationContext("applicationContext.xml");
            	Persona daniel = (Persona)iocContainer.getBean("Dani");
            	System.out.println("Mi Bean creado por spring");
            	System.out.println(daniel);
            	
                conn = DriverManager.getConnection("jdbc:sqlite:indra.db");
                
                System.out.println("Creando la base de datos indr.db");
                
                Statement createStatement = conn.createStatement();
                createStatement.executeUpdate(
                            "CREATE TABLE IF NOT EXISTS Persona(" +
                            "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "Nombre TEXT NOT NULL," +
                            "Edad INTEGER NOT NULL)" 
                        );
                
                System.out.println("Tabla crada");
                
               /* System.out.println("Insertando un par de personas");
                String theChosenOnes= "Angello,Jean,Marcos,Carlos";
                
                for(String chosenOne : theChosenOnes.split(",")) {
                	System.out.println("Insertando a:"+ chosenOne);
                
                PreparedStatement insert =  conn.prepareStatement("INSERT INTO Persona(Nombre,Edad) VALUES (?,?)");
                insert.setString(1,chosenOne);
                insert.setInt(2, 24);
                insert.executeUpdate();
                }*/
               // System.out.println("Personas Insertadas");
                System.out.println("Modificando edad de jean");
                PreparedStatement update = conn.prepareStatement("UPDATE Persona SET Edad=? WHERE Nombre=?");
                update.setInt(1, 23);
                update.setString(2, "Jean");
                update.executeUpdate();
                System.out.println("Edad Modificada");
                
               /* Statement select = conn.createStatement();
                ResultSet resulset = select.executeQuery("SELECT * FROM Persona");
                List<Persona> cracksDeJava = new ArrayList<Persona>();
                while(resulset.next()) {
                	Persona crack =  Persona
                			.builder()
                			.id(resulset.getInt("id"))
                		    .nombre(resulset.getString("nombre"))
                		    .edad(resulset.getInt("edad"))
                		    .build();
                	
                	cracksDeJava.add(crack);
                }*/
                
                //Listo las personas con spring
                PersonaService service = (PersonaService)iocContainer.getBean("personaService");
                List<Persona> cracksDeJava= service.cracksDeJava();
                cracksDeJava.forEach(System.out::println);
                
            } finally {
                if (conn != null) {
                    conn.close();
                }
             
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

	
}


