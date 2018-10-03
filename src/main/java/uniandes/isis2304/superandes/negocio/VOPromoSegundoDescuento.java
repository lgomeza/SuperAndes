package uniandes.isis2304.superandes.negocio;

public interface VOPromoSegundoDescuento {
	/**
	 * @return the idPromo
	 */
	public long getIdPromo();

	/**
	 * @return the pague
	 */
	public double getPague();

	/**
	 * @return the lleveSegundoA
	 */
	public double getLleveSegundoA();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion para llevar el segundo a cierto porcentaje de descuento.
	 */
	public String toString();
}
