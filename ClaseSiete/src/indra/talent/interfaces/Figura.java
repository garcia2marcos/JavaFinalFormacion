package indra.talent.interfaces;

public abstract class Figura implements Area, Perimetro, Comparable<Figura> {
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return (int)this.calcularArea()-(int)o.calcularArea();
	}
}
