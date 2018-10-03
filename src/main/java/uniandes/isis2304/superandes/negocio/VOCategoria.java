package uniandes.isis2304.superandes.negocio;

public interface VOCategoria {
	
	/**
	 * @return El nombre de la categoria
	 */
	public String getNombre();
	
	/**
	 * @return La descripción de la categoría
	 */
	public String getDescripcion();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString();
}
