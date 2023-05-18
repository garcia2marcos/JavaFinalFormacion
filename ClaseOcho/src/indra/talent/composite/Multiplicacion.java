package indra.talent.composite;

public class Multiplicacion extends OperacionBinaria{

	public Multiplicacion(Operacion opIzq, Operacion opDcha) {
		super(opIzq, opDcha);
		// TODO Auto-generated constructor stub
	}
	
	
	public Multiplicacion(double opIzq, double opDcha) {
		super(opIzq, opDcha);
		// TODO Auto-generated constructor stub
	}


	public Multiplicacion(double opIzq, Operacion opDcha) {
		super(opIzq, opDcha);
		// TODO Auto-generated constructor stub
	}


	public Multiplicacion(Operacion opIzq, double opDcha) {
		super(opIzq, opDcha);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return this.opIzq.calcular()*this.opDcha.calcular();
	}
}

