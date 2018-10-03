package uniandes.isis2304.superandes.negocio;


public interface VOEstante {
	/**
	 * @return El id del estante
	 */
	public long getId(); 

    /**
	 * @return La capacidad del estante en peso.
	 */
	public double getCapacidad();

	/**
	 * @return Cuanto espacio de la capacidad se encuentra ocupado.
	 */
	public double getOcupacion();

	/**
	 * @return El tipo de producto que se almacena en este estante.
	 */
	public String getTipoProducto();
	
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
