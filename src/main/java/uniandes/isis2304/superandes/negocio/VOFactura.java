package uniandes.isis2304.superandes.negocio;

import java.util.Date;

public interface VOFactura {
	/**
	 * @return the id
	 */
	public long getId();

	/**
	 * @return the fechaGenerada
	 */
	public Date getFechaGenerada();

	/**
	 * @return the valorTotal
	 */
	public double getValorTotal();

	/**
	 * @return the idCliente
	 */
	public long getIdCliente();
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la factura.
	 */
	public String toString();
}
