package uniandes.isis2304.superandes.negocio;

import java.util.Date;

public interface VOOrdenPedido {
	/**
	 * @return the id
	 */
	public long getId();

	/**
	 * @return the fechaDeGeneracion
	 */
	public Date getFechaDeGeneracion();

	/**
	 * @return the fechaDeEntrega
	 */
	public Date getFechaDeEntrega();

	/**
	 * @return the estado
	 */
	public String getEstado();
	/**
	 * @return the calificacionCalidad
	 */
	public double getCalificacionCalidad();

	/**
	 * @return the idProducto
	 */
	public long getIdProducto();

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
	* @return Una cadena de caracteres con todos los atributos de la orden de pedido.
	*/
	public String toString();
}
