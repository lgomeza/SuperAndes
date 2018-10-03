package uniandes.isis2304.superandes.negocio;

import java.util.List;

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
	public Double getCapacidad();
	
	/**
	 * @return Cuanto espacio de la capacidad se encuentra ocupado.
	 */
	public Double getOcupacion();
	
	/**
	 * @return El tipo de producto que se almacena en esta bodega.
	 */
	public String getTipoProducto();

	/**
	 * @return Los productos.
	 */
	public List<Producto> getProductos();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString();
}
