package indra.talent.composite;

public abstract class OperacionBinaria extends Operacion{
	
	protected Operacion opIzq;
	protected Operacion opDcha;
	
	
	public OperacionBinaria(Operacion opIzq, Operacion opDcha) {
		super();
		this.opIzq = opIzq;
		this.opDcha = opDcha;
	}
	
	public OperacionBinaria(double opIzq, double opDcha) {
		this.opIzq = new Valor(opIzq);
		this.opDcha = new Valor(opDcha);
	}
	
	public OperacionBinaria(Operacion opIzq, double opDcha) {
		super();
		this.opIzq = opIzq;
		this.opDcha = new Valor(opDcha);
	}
	
	public OperacionBinaria(double opIzq, Operacion opDcha) {
		this.opIzq = new Valor(opIzq);
		this.opDcha = opDcha;
	}
	

}
