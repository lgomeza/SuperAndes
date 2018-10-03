package uniandes.isis2304.superandes.negocio;

import java.util.ArrayList;
import java.util.List;

public class Bodega implements VOBodega{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id de la bodega
	 */
	private long id;
	
	/**
	 * La capacidad de la bodega en peso.
	 */
	private double capacidad;

	/**
	 * Cuanto espacio de la capacidad total se encuentra ocupado
	 */
	private double ocupacion;
	
	/**
	 * El tipo de producto que se almacena en esta bodega.
	 */
	private String tipoProducto;
	
	/**
	 * El tipo de producto que se almacena en esta bodega.
	 */
	private List<Producto> productos;


	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Bodega() 
    {
    	this.id = 0;
		this.capacidad = 0;
		this.ocupacion = 0;
		this.tipoProducto = "";
		this.productos = new ArrayList<Producto>();
	}
	
	/**
	 * Constructor con valores
	 * @param id - El id de la bodega
	 * @param capacidad - La capacidad en peso de la bodega.
	 * @param ocupacion - Cuanto espacio de la capacidad total se encuentra ocupado.
	 * @param tipoProducto - El tipo de producto que se almacena en esta bodega.
	 */
    public Bodega(long id, Double capacidad, Double ocupacion, String tipoProducto, List<Producto> productos) 
    {
    		this.id = id;
		this.capacidad = capacidad;
		this.ocupacion = ocupacion;
		this.tipoProducto = tipoProducto;
		this.productos = productos;
	}
    

	/**
	 * @return El id de la bodega
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

    /**
	 * @return La capacidad de la bodega en peso.
	 */
	public Double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return Cuanto espacio de la capacidad se encuentra ocupado.
	 */
	public Double getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Double ocupacion) {
		this.ocupacion = ocupacion;
	}

	/**
	 * @return El tipo de producto que se almacena en esta bodega.
	 */
	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	/**
	 * @return Los productos guardados en la bodega.
	 */
	public List<Producto> getProductos() {
		return productos;
	}
	
    public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
    
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString() {
		return "Bodega [id=" + id + ", capacidad=" + capacidad + ", ocupacion=" + ocupacion + ", tipoProducto=" + tipoProducto + "]";
	}
	
	/**
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toStringCompleto() {
		String resp = this.toString();
		resp += "\n --- Productos\n";
		for (Producto producto : productos)
		{
			resp += producto.toString() + "\n";
		}
		return resp;
	}

}
