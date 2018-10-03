package uniandes.isis2304.superandes.negocio;

public class Categoria implements VOCategoria {

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El nombre de la categoría.
	 */
	private String nombre;

	/**
	 * La descripción de la categoría.
	 */
	private String descripcion;


	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Categoria() 
    {
    		this.nombre = "";
		this.descripcion = "";
	}
	
	/**
	 * Constructor con valores
	 * @param nombre - El nombre de la categoría
	 * @param descripcion - La descripción de la categoría.
	 */
    public Categoria(String nombre, String descripcion) 
    {
    		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * @return El nombre de la categoria
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return El nombre de la descripción
	 */
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString() {
		return "Categoria [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
}
