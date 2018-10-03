package uniandes.isis2304.superandes.negocio;

public class LocalVentas implements VOLocalVentas{

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id del local de ventas.
	 */
	private long id;
	
	/**
	 * La cantidad de cajas del local de ventas.
	 */
	private int cantidadDeCajas;

	/**
	 * La capacidad máxima que tiene el local de ventas.
	 */
	private double capacidadMaxima;
	
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
	public LocalVentas() 
    {
		this.id = 0;
		this.cantidadDeCajas = 0;
		this.capacidadMaxima = 0;
		this.dirSucursal = "";
		this.ciudadSucursal = "";
	}


	/**
	 * Constructor con valores
	 * @param id - El id del local de ventas.
	 * @param cantidadDeCajas - El cantidadDeCajas de la categoría
	 * @param capacidadMaxima - La descripción de la categoría.
	 * @param dirSucursal - La direccion de la sucursal a la que pertenece el local.
	 */
    public LocalVentas(long id, int cantidadDeCajas, double capacidadMaxima, String dirSucursal, String ciudadSucursal) 
    {
		this.id = id;
    		this.cantidadDeCajas = cantidadDeCajas;
		this.capacidadMaxima = capacidadMaxima;
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
	 * @return El cantidadDeCajas de la categoria
	 */
	public int getCantidadDeCajas() {
		return cantidadDeCajas;
	}

	public void setCantidadDeCajas(int cantidadDeCajas) {
		this.cantidadDeCajas = cantidadDeCajas;
	}

	/**
	 * @return El cantidadDeCajas de la descripción
	 */
	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
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
	 * @return Una cadena de caracteres con todos los atributos del local de ventas.
	 */
	public String toString() {
		return "Categoria [cantidadDeCajas=" + cantidadDeCajas + ", capacidadMaxima=" + capacidadMaxima + ", dirSucursal" + dirSucursal + "]";
	}
}
