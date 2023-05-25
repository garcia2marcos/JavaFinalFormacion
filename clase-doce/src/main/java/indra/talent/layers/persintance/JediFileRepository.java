package indra.talent.layers.persintance;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import indra.talent.layers.models.Jedi;
import indra.talent.layers.persistencia.interfaces.Repository;

public abstract class JediFileRepository implements Repository<Jedi>{
	
	private int getJediCount() {
		File archivo = new File("./jedis");
		return archivo.listFiles().length;
	}
	
	public Jedi findById(int id) throws NotFoundException{
		File archivo = new File(String.format("./jedis/%d.txt", id));
		
		if (!archivo.exists()) {
			throw new NotFoundException();
			
		}
		
		try {
			
			try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
			String linea = reader.readLine();
			String[] lineas = linea.split(";");
			
			Jedi jedi = new Jedi(lineas[1],
					Integer.parseInt(lineas[2]),
					new Color(Integer.parseInt(lineas[3])));
			
			jedi.setId(Integer.parseInt(lineas[0]));
			return jedi;
			
			}
			
		}catch(Exception e) {
			throw new NotFoundException();
		}
	}
	
	public List<Jedi> findAll(){
		
		try {
		
		List<Jedi> jedis = new ArrayList<Jedi>();
		File directorio = new File("./jedis");
		File[] archivos =directorio.listFiles();
		
		for(File archivo: archivos) {
			
			String nombre = archivo.getName();
			nombre =nombre.replaceFirst(".txt", "");
			
			Jedi jedi = this.findById(Integer.parseInt(nombre));
			jedis.add(jedi);
		}
			return jedis;
			
		}catch(Exception e) {
			 throw new Error("Error Inesperado");
			
		}
		
		
		
		
	}
	
	
	public void delete (int id) throws NotFoundException {
		File file = new File(String.format("%d.txt", id));
		
		if(!file.exists()) {
			throw new NotFoundException();
			
		}
		
		file.delete();
	}

	public void save(Jedi jedi) throws SaveErrorException{
		
		jedi.setId(this.getJediCount()+1);
		File archivo = new File(String.format("./jedis/%d.txt", jedi.getId()));
		
		try {
		
		archivo.createNewFile();
		
		try (FileWriter writer  = new FileWriter(archivo)){
			writer.write(String.format("%d;%s;%d;%d", 
					jedi.getId(),
					jedi.getNombre(),
					jedi.getNivelFuerza(),
					jedi.getColorLightSaver().getRGB()));

		}
		
		
		
		} catch (Exception ex) {
			throw new SaveErrorException();
		}
		
			
		
		
	}
}
