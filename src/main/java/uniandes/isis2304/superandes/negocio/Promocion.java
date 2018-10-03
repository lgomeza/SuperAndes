package uniandes.isis2304.superandes.negocio;

import java.util.Date;

public class Promocion implements VOPromocion {
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id de la promocion
	 */
	private long id;
	
	/**
	 * La fecha de creacion de la promocion
	 */
	private Date fechaDeCreacion;

	/**
	 * La fecha de finalizacion de la promocion
	 */
	private Date fechaDeFinalizacion;
	
	/**
	 * El nombre de la promocion.
	 */
	private String nombre;
	
	/**
	 * La direccion de la sucursal asignada a la orden.
	 */
	private String dirSucursal;
	
	/**
	 *  La ciudad de la sucursal asignada a la orden.
	 */
	private String ciudadSucursal;
	
	/**
	 * El id del producto al que se aplica la promocion
	 */
	private long idProducto;

	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Promocion() {
		this.id = 0;
		this.fechaDeCreacion = new Date();
		this.fechaDeFinalizacion = new Date();
		this.nombre = "";
		this.dirSucursal = "";
		this.ciudadSucursal = "";
		this.idProducto = 0;
	}
	
	/**
	 * @param id El id de la promocion
	 * @param fechaDeCreacion La fecha de creacion de la promocion
	 * @param fechaDeFinalizacion La fecha de finalizacion de la promocion
	 * @param nombre El nombre de la promocion
	 * @param dirSucursal La direccion de la sucursal en la que se tiene la promocion
	 * @param ciudadSucursal La ciudad de la sucursal en la que se tiene la promocion
	 * @param idProducto El id del producto al que se aplica la promocion
	 */
	public Promocion(long id, Date fechaDeCreacion, Date fechaDeFinalizacion, String nombre, String dirSucursal,
			String ciudadSucursal, long idProducto) {
		this.id = id;
		this.fechaDeCreacion = fechaDeCreacion;
		this.fechaDeFinalizacion = fechaDeFinalizacion;
		this.nombre = nombre;
		this.dirSucursal = dirSucursal;
		this.ciudadSucursal = ciudadSucursal;
		this.idProducto = idProducto;
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
	 * @return the fechaDeCreacion
	 */
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	/**
	 * @param fechaDeCreacion the fechaDeCreacion to set
	 */
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	/**
	 * @return the fechaDeFinalizacion
	 */
	public Date getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}

	/**
	 * @param fechaDeFinalizacion the fechaDeFinalizacion to set
	 */
	public void setFechaDeFinalizacion(Date fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion.
	 */
	public String toString() {
		return "Promocion [id=" + id + ", fecha de creacion=" + fechaDeCreacion + ", fecha de finalizacion=" + fechaDeFinalizacion 
				+ ", nombre=" + nombre + ", direccion sucursal=" + dirSucursal + ", ciudad sucursal=" + ciudadSucursal + ", idProducto=" + idProducto +  "]";
	}
}
