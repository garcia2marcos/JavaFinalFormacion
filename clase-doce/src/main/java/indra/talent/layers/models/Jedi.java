package indra.talent.layers.models;
import java.awt.Color;

public class Jedi extends BusinessObject{
	
	private String nombre;
	private int nivelFuerza;
	private Color colorLightSaver;
	
	public Jedi(String nombre, int nivelFuerza, Color colorLightSaver) {
		super();
		this.nombre = nombre;
		this.nivelFuerza = nivelFuerza;
		this.colorLightSaver = colorLightSaver;

	}
	public Jedi(String nombre, Color colorLightSaver) {
		super();
		this.nombre = nombre;
		this.colorLightSaver = colorLightSaver;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNivelFuerza() {
		return nivelFuerza;
	}

	public Color getColorLightSaver() {
		return colorLightSaver;
		
	}

	public void setNivelFuerza(int nivelFuerza) {
		this.nivelFuerza = nivelFuerza;
	}
	
	@Override
    public String toString() {
        return "Jedi [getId()=" + getId() + ", nombre=" + nombre + ", nivelDeFuerza=" + nivelFuerza + ", colorLightSaber=" + colorLightSaver+"]";
    }
	
	

}
