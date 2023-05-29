package indra.talent.database.persistence;

import java.sql.*;
import java.util.*;

import indra.talent.database.models.Persona;

public class PersonaRepository implements Repository<Persona>{

	@Override
	public void save(Persona nuevo) throws SaveErrorException {
		// TODO Auto-generated method stub
		
		throw new Error("Not Implemented");
		
	}

	@Override
	public void update(Persona existente) throws UpdateErrorException {
		// TODO Auto-generated method stub
		throw new Error("Not Implemented");
	}

	@Override
	public void delete(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		throw new Error("Not Implemented");
	}

	@Override
	public List<Persona> findAll() {
		List<Persona> result = new ArrayList<Persona>();
		Connection conn = null;
		try {

			try {
				conn = DriverManager.getConnection("jdbc:sqlite:indra.db");
				Statement select = conn.createStatement();
				ResultSet resulset = select.executeQuery("SELECT * FROM Persona");

				while (resulset.next()) {
					Persona pe = Persona.builder().id(resulset.getInt("id")).nombre(resulset.getString("nombre"))
							.edad(resulset.getInt("edad")).build();

					result.add(pe);
				}

			} finally {
				if (conn != null) {
					conn.close();
				}

			}

		} catch (SQLException e) {
			throw new Error(e.getMessage());
		}

		return result;
	}
		

	@Override
	public Persona findById(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		throw new Error("Not Implemented");
		//return null;
	}
	

}
