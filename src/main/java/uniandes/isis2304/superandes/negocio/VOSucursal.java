package uniandes.isis2304.superandes.negocio;

public interface VOSucursal {

	/**
	 * @return the nombre
	 */
	public String getNombre();

	/**
	 * @return the tamanho
	 */
	public String getTamanho();
	/**
	 * @return the segmento
	 */
	public String getSegmento();

	/**
	 * @return the direccion
	 */
	public String getDireccion();

	/**
	 * @return the ciudad
	 */
	public String getCiudad();

	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la sucursal.
	 */
	public String toString();
}
