package uniandes.isis2304.superandes.negocio;

public interface VOLocalVentas {

	/**
	 * @return the id
	 */
	public long getId();
	
	/**
	 * @return El cantidadDeCajas de la categoria
	 */
	public int getCantidadDeCajas();

	/**
	 * @return El cantidadDeCajas de la descripción
	 */
    public double getCapacidadMaxima();

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
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString();
}
