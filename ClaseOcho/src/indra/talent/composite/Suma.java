package indra.talent.composite;

public class Suma extends OperacionBinaria{

	public Suma(Operacion opIzq, Operacion opDcha) {
		super(opIzq, opDcha);
		// TODO Auto-generated constructor stub
	}
	
	
	public Suma(double opIzq, double opDcha) {
		super(opIzq, opDcha);
		// TODO Auto-generated constructor stub
	}


	public Suma(double opIzq, Operacion opDcha) {
		super(opIzq, opDcha);
		// TODO Auto-generated constructor stub
	}


	public Suma(Operacion opIzq, double opDcha) {
		super(opIzq, opDcha);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return this.opIzq.calcular()+this.opDcha.calcular();
	}
	

}
