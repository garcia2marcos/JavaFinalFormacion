package indra.talent.interfaces;

public class Triangulo extends Figura{
	
	private double altura;
	private double base;
	private double lado1;
	private double lado2;
	
	
	
	public Triangulo(double altura, double base, double lado1, double lado2) {
		super();
		this.altura = altura;
		this.base = base;
		this.lado1= lado1;
		this.lado1= lado2;
		
	}

	public double getAltura() {
		return altura;
	}

	public double getBase() {
		return base;
	}
	
	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (this.getBase()*this.getAltura())/2;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.getLado1()+ this.getLado2()+ this.getBase();
	}
	

}
