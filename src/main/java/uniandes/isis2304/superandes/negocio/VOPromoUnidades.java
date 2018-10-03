package uniandes.isis2304.superandes.negocio;

public interface VOPromoUnidades {
	/**
	 * @return the idPromo
	 */
	public long getIdPromo();

	/**
	 * @return the pague
	 */
	public int getPague();

	/**
	 * @return the lleve
	 */
	public int getLleve();
	
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion por unidades.
	 */
	public String toString();
}
