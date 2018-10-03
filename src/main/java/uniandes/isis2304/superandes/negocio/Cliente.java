package uniandes.isis2304.superandes.negocio;

public class Cliente implements VOCliente{
    /* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * La identificación del cliente
	 */
	private int identificacion;
	
	/**
	 * El nombre del cliente.
	 */
	private String nombre;

	/**
	 * La direccion del cliente
	 */
	private String direccion;
	
	/**
	 * El correo del cliente.
	 */
	private String correo;


	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Cliente() 
    {
    	this.identificacion = 0;
		this.nombre = "";
		this.direccion  = "";
		this.correo = "";
	}
	
	/**
	 * Constructor con valores
	 * @param identificacion - La identificacion del cliente
	 * @param nombre - El nombre del cliente.
	 * @param direccion - La direccion del cliente
	 * @param correo - El correo del cliente.
	 */
    public Cliente(int identificacion, String nombre, String direccion, String correo) 
    {
    	this.identificacion = identificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
    }
    
    	/**
	 * @return the identificacion
	 */
	public int getIdentificacion() {
		return identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
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
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
    }
    
    @Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del cliente.
	 */
	public String toString() {
		return "Cliente [identificacion=" + identificacion + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo + "]";
	}
}
