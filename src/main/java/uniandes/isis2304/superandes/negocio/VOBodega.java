package uniandes.isis2304.superandes.negocio;

public interface VOBodega {
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
	 * @return El id de la bodega
	 */
	public long getId();
	
     /**
	 * @return La capacidad de la bodega en peso.
	 */
	public double getCapacidad();
	
	/**
	 * @return Cuanto espacio de la capacidad se encuentra ocupado.
	 */
	public double getOcupacion();
	
	/**
	 * @return El tipo de producto que se almacena en esta bodega.
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
