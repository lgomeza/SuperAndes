package uniandes.isis2304.superandes.negocio;

public interface VOProveen {
	/**
	 * @return the idProveedor
	 */
	public long getIdProveedor();

	/**
	 * @return the idProducto
	 */
	public long getIdProducto();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de "Proveen".
	 */
	public String toString();
}
