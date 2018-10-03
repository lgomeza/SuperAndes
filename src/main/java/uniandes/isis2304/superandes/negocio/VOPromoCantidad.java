package uniandes.isis2304.superandes.negocio;

public interface VOPromoCantidad {
	/**
	 * @return the idPromo
	 */
	public long getIdPromo();

	/**
	 * @return the pague
	 */
	public double getPague();

	/**
	 * @return the lleve
	 */
	public double getLleve();
	
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion por cantidad.
	 */
	public String toString();
}
