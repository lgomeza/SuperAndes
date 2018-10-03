package uniandes.isis2304.superandes.negocio;

public class Sucursal implements VOSucursal{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	
	/**
	 * El nombre de la sucursal
	 */
	private String nombre;

	/**
	 * El tamanho de la sucursal.
	 */
	private String tamanho;

	/**
	 * El segmento de la sucursal
	 */
	private String segmento;
	
	/**
	 * La direccion de la sucursal
	 */
	private String direccion;
	
	/**
	 * La ciudad de la sucursal
	 */
	private String ciudad;

	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Sucursal() {
		this.nombre = "";
		this.tamanho = "";
		this.segmento = "";
		this.direccion = "";
		this.ciudad = "";
	}
	
	/**
	 * @param nombre El nombre de la sucursal
	 * @param tamanho El tamanho de la sucursal
	 * @param segmento El segmento de la sucursal
	 * @param direccion La direccion en la que esta la sucursal
	 * @param ciudad La ciudad en la que se encuentra la sucursal
	 */
	public Sucursal(String nombre, String tamanho, String segmento, String direccion, String ciudad) {
		this.nombre = nombre;
		this.tamanho = tamanho;
		this.segmento = segmento;
		this.direccion = direccion;
		this.ciudad = ciudad;
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
	 * @return the tamanho
	 */
	public String getTamanho() {
		return tamanho;
	}

	/**
	 * @param tamanho the tamanho to set
	 */
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 * @return the segmento
	 */
	public String getSegmento() {
		return segmento;
	}

	/**
	 * @param segmento the segmento to set
	 */
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la sucursal.
	 */
	public String toString() {
		return "Sucursal nombre=" + nombre + ",tamanho=" + tamanho + ", segmento=" + segmento + ", direccion=" + direccion + ", ciudad=" + ciudad + "]";
	}
	
}
