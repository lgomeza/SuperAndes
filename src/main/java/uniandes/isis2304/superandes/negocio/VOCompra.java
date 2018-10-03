package uniandes.isis2304.superandes.negocio;

public interface VOCompra {
	/**
	 * @return the idFactura
	 */
	public long getIdFactura();

	/**
	 * @return the idProducto
	 */
	public long getIdProducto();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la factura.
	 */
	public String toString();
}
