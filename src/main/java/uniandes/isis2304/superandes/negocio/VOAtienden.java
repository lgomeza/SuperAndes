package uniandes.isis2304.superandes.negocio;

public interface VOAtienden {
	/**
	 * @return the idProveedor
	 */
	public long getIdProveedor();

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
	 * @return Una cadena de caracteres con todos los atributos de "Atienden".
	 */
	public String toString();
}
