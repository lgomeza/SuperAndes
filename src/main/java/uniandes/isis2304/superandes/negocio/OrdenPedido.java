package uniandes.isis2304.superandes.negocio;

import java.util.Date;

public class OrdenPedido implements VOOrdenPedido {
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id de la orden
	 */
	private long id;
	
	/**
	 * La fecha en que se genero la orden
	 */
	private Date fechaDeGeneracion;

	/**
	 * La fecha en que se entrego la orden.
	 */
	private Date fechaDeEntrega;
	
	/**
	 * El estado de la orden.
	 */
	private String estado;
	
	/**
	 * La calificacion de la calidad de la orden.
	 */
	private double calificacionCalidad;
	
	/**
	 * El id del producto asignado a la orden.
	 */
	private long idProducto;
	
	/**
	 * El id del proveedor asignado a la orden.
	 */
	private long idProveedor;
	
	/**
	 *  El id de la sucursal asignada a la orden.
	 */
	private String dirSucursal;
	
	/**
	 *  El id de la sucursal asignada a la orden.
	 */
	private String ciudadSucursal;

	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public OrdenPedido() {
		this.id = 0;
		this.fechaDeGeneracion = new Date();
		this.fechaDeEntrega = new Date();
		this.estado = "";
		this.calificacionCalidad = 0;
		this.idProducto = 0;
		this.idProveedor = 0;
		this.dirSucursal = "";
		this.ciudadSucursal = "";
	}
	
	/**
	 * @param id El id de la orden
	 * @param fechaDeGeneracion La fecha de generacion de la orden
	 * @param fechaDeEntrega La fecha de entrega de la orden
	 * @param estado El estado de la orden
	 * @param calificacionCalidad
	 * @param idProducto El producto al que corresponde la orden
	 * @param idProveedor El proveedor al que corresponde la orden
	 * @param dirSucursal La sucursal a la que corresponde la orden.
	 */
	public OrdenPedido(long id, Date fechaDeGeneracion, Date fechaDeEntrega, String estado, double calificacionCalidad,
			long idProducto, long idProveedor, String dirSucursal, String ciudadSucursal) {
		this.id = id;
		this.fechaDeGeneracion = fechaDeGeneracion;
		this.fechaDeEntrega = fechaDeEntrega;
		this.estado = estado;
		this.calificacionCalidad = calificacionCalidad;
		this.idProducto = idProducto;
		this.idProveedor = idProveedor;
		this.dirSucursal = dirSucursal;
		this.ciudadSucursal = ciudadSucursal;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fechaDeGeneracion
	 */
	public Date getFechaDeGeneracion() {
		return fechaDeGeneracion;
	}

	/**
	 * @param fechaDeGeneracion the fechaDeGeneracion to set
	 */
	public void setFechaDeGeneracion(Date fechaDeGeneracion) {
		this.fechaDeGeneracion = fechaDeGeneracion;
	}

	/**
	 * @return the fechaDeEntrega
	 */
	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}

	/**
	 * @param fechaDeEntrega the fechaDeEntrega to set
	 */
	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the calificacionCalidad
	 */
	public double getCalificacionCalidad() {
		return calificacionCalidad;
	}

	/**
	 * @param calificacionCalidad the calificacionCalidad to set
	 */
	public void setCalificacionCalidad(double calificacionCalidad) {
		this.calificacionCalidad = calificacionCalidad;
	}

	/**
	 * @return the idProducto
	 */
	public long getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @return the idProveedor
	 */
	public long getIdProveedor() {
		return idProveedor;
	}

	/**
	 * @param idProveedor the idProveedor to set
	 */
	public void setIdProveedor(long idProveedor) {
		this.idProveedor = idProveedor;
	}

	/**
	 * @return the dirSucursal
	 */
	public String getDirSucursal() {
		return dirSucursal;
	}

	/**
	 * @param dirSucursal the dirSucursal to set
	 */
	public void setDirSucursal(String dirSucursal) {
		this.dirSucursal = dirSucursal;
	}
	
	/**
	 * @return the ciudadSucursal
	 */
	public String getCiudadSucursal() {
		return ciudadSucursal;
	}

	/**
	 * @param ciudadSucursal the ciudadSucursal to set
	 */
	public void setCiudadSucursal(String ciudadSucursal) {
		this.ciudadSucursal = ciudadSucursal;
	}

	@Override
	/**
	* @return Una cadena de caracteres con todos los atributos de la orden de pedido.
	*/
	public String toString() {
		return "OrdenPedido [id=" + id + ", fecha de generacion=" + fechaDeGeneracion.toString() + ", fecha de entrega=" + fechaDeEntrega.toString() 
				+ ", estado=" + estado + ", calificacion de calidad=" + calificacionCalidad + ", idProducto=" + idProducto 
				+ ", idProveedor=" + idProveedor + ", dirSucursal=" + dirSucursal + "]";
	}
	
}
