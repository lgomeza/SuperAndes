package uniandes.isis2304.superandes.negocio;

import java.util.Date;

public interface VOPromocion {
	/**
	 * @return the id
	 */
	public long getId();

	/**
	 * @return the fechaDeCreacion
	 */
	public Date getFechaDeCreacion();

	/**
	 * @return the fechaDeFinalizacion
	 */
	public Date getFechaDeFinalizacion();

	/**
	 * @return the nombre
	 */
	public String getNombre();

	/**
	 * @return the dirSucursal
	 */
	public String getDirSucursal();

	/**
	 * @return the ciudadSucursal
	 */
	public String getCiudadSucursal();

	/**
	 * @return the idProducto
	 */
	public long getIdProducto();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion.
	 */
	public String toString();
}
