package uniandes.isis2304.superandes.negocio;

public class Estante implements VOEstante{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id del estante
	 */
	private long id;
	
	/**
	 * La capacidad del estante en peso.
	 */
	private double capacidad;

	/**
	 * Cuanto espacio del estante se encuentra ocupado
	 */
	private double ocupacion;
	
	/**
	 * El tipo de producto que se almacena en este estante.
	 */
	private String tipoProducto;
	
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
	public Estante() 
    {
    		this.id = 0;
		this.capacidad = 0;
		this.ocupacion = 0;
		this.tipoProducto = "";
		this.dirSucursal = "";
		this.ciudadSucursal = "";
	}
	
	/**
	 * Constructor con valores
	 * @param id - El id del estante
	 * @param capacidad - La capacidad en peso del estante.
	 * @param ocupacion - Cuanto espacio de la capacidad total se encuentra ocupado.
	 * @param tipoProducto - El tipo de producto que se almacena en el estante.
	 * @param dirSucursal - La direccion de la sucursal a la que pertenece el estante.
	 */
    public Estante(long id, Double capacidad, Double ocupacion, String tipoProducto, String dirSucursal) 
    {
    		this.id = id;
		this.capacidad = capacidad;
		this.ocupacion = ocupacion;
		this.tipoProducto = tipoProducto;
		this.dirSucursal = dirSucursal;
		this.ciudadSucursal = "";
	}
    

	/**
	 * @return El id del estante
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

    /**
	 * @return La capacidad del estante en peso.
	 */
	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return Cuanto espacio de la capacidad se encuentra ocupado.
	 */
	public double getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Double ocupacion) {
		this.ocupacion = ocupacion;
	}

	/**
	 * @return El tipo de producto que se almacena en este estante.
	 */
	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
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
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString() {
		return "Estante [id=" + id + ", capacidad=" + capacidad + ", ocupacion=" + ocupacion + ", tipoProducto=" + tipoProducto + ", dirSucursal" + dirSucursal + "]";
	}

}
