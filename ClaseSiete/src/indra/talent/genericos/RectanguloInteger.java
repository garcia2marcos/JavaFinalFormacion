package indra.talent.genericos;

public class RectanguloInteger extends FiguraGenerica<Integer> {
	private int base;
	private int altura;
	
	
	
	public RectanguloInteger(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public Integer calcularArea() {
		// TODO Auto-generated method stub
		return this.getBase()*this.getAltura();
	}
	@Override
	public Integer calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*this.getBase()+2*this.getAltura();
	}

}
