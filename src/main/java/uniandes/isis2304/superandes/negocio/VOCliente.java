package uniandes.isis2304.superandes.negocio;

public interface VOCliente {
    	/**
	 * @return the identificacion
	 */
	public int getIdentificacion();

	/**
	 * @return the nombre
	 */
	public String getNombre();

	/**
	 * @return the direccion
	 */
	public String getDireccion();

	/**
	 * @return the correo
	 */
    public String getCorreo();
    
    @Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del cliente.
	 */
	public String toString();
}
