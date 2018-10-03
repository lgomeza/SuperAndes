package uniandes.isis2304.superandes.negocio;

public interface VOPromoPorcentaje {
	/**
	 * @return the idPromo
	 */
	public long getIdPromo();

	/**
	 * @return the porcentajeDcto
	 */
	public double getPorcentajeDcto();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion con porcentaje de descuento.
	 */
	public String toString();
}
