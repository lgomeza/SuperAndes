package uniandes.isis2304.superandes.negocio;

public interface VOVenden {
	/**
	 * @return the idProducto
	 */
	public long getIdProducto();

	/**
	 * @return the dirSucursal
	 */
	public String getDirSucursal();

	/**
	 * @return the ciudadSucursal
	 */
	public String getCiudadSucursal();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de "Venden".
	 */
	public String toString();
}
