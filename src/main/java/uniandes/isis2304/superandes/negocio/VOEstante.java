package uniandes.isis2304.superandes.negocio;

import java.util.List;

public interface VOEstante {
	/**
	 * @return El id del estante
	 */
	public long getId(); 

    /**
	 * @return La capacidad del estante en peso.
	 */
	public Double getCapacidad();

	/**
	 * @return Cuanto espacio de la capacidad se encuentra ocupado.
	 */
	public Double getOcupacion();

	/**
	 * @return El tipo de producto que se almacena en este estante.
	 */
	public String getTipoProducto();
	/**
	 * @return Los productos guardados en el estante.
	 */
	public List<Producto> getProductos();

	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString();
    
}
