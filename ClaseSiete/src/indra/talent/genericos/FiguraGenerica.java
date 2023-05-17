package indra.talent.genericos;

//incluyo la palabra generica por tema didactico pero esta mal
public abstract class FiguraGenerica<T extends Number> {
	public abstract T calcularArea();
	public abstract T calcularPerimetro();
}
