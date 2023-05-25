package indra.talent.layers.services;

import java.awt.Color;
import java.util.Random;

import indra.talent.layers.models.Jedi;
import indra.talent.layers.persintance.JediFileRepository;
import indra.talent.layers.persistencia.interfaces.Repository;

public class JediService {
	
	private Repository<Jedi> repository;	
	
	public JediService(Repository<Jedi> repo) {
		//this.repository = new JediMockRepository();
		//this.repository = new JediFileRepository();
		this.repository=repo;
	}
	
	private int calcularNivelFuerza(Jedi j) {
		 return new Random().nextInt(1000,100000);
	}
	
	private Color crearSableNuevo() {
		return Color.GREEN;
	}
	
	public void alistar(String nombre) {
		
		Jedi nuevo = new Jedi(nombre, this.crearSableNuevo());
		nuevo.setNivelFuerza(this.calcularNivelFuerza(nuevo));
		this.repository.save(nuevo);
		
	}

}
