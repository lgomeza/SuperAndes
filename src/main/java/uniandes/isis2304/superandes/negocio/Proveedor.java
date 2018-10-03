package uniandes.isis2304.superandes.negocio;

public class Proveedor {
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * La identificación del cliente
	 */
	private String nit;

	/**
	 * El nombre del cliente.
	 */
	private String nombre;

	/**
	 * La direccion del cliente
	 */
	private double calificacion;



	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Proveedor() {
		this.nit = "";
		this.nombre = "";
		this.calificacion = 0;
	}

	/**
	 * @param nit El NIT del proveedor
	 * @param nombre El nombre del proveedor
	 * @param calificacion La calificacion del proveedor
	 */
	public Proveedor(String nit, String nombre, double calificacion) {
		this.nit = nit;
		this.nombre = nombre;
		this.calificacion = calificacion;
	}

	/**
	 * @return the nit
	 */
	public String getNit() {
		return nit;
	}

	/**
	 * @param nit the nit to set
	 */
	public void setNit(String nit) {
		this.nit = nit;
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
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString() {
		return "Proveedor [NIT=" + nit + ",nombre=" + nombre + ", calificacion=" + calificacion + "]";
	}
	
	
}
