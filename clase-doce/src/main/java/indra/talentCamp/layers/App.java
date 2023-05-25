package indra.talentCamp.layers;

import java.awt.Color;

import indra.talent.layers.models.Jedi;
import indra.talent.layers.persintance.JediFileRepository;
import indra.talent.layers.persintance.NotFoundException;
import indra.talent.layers.persintance.SaveErrorException;

public class App {

	public static void main(String[] args) {
		
		JediFileRepository prueba = new JediFileRepository();
		System.out.println("Salvamos un nuevo Jedi");
		
		/*try {
			prueba.save(new Jedi("Anakin",10000,Color.RED));
		} catch (SaveErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*Jedi jedi;
		try {
			
			jedi= prueba.findById(1);
			System.out.println(jedi);
		}catch(NotFoundException e) {
			e.printStackTrace();
		}*/
		
		//prueba.findAll();
	}

}
