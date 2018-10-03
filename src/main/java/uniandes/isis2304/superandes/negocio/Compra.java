package uniandes.isis2304.superandes.negocio;

public class Compra implements VOCompra{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id de la factura
	 */
	private long idFactura;
	
	/**
	 * El id del producto
	 */
	private long idProducto;


	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/

    /**
     * Constructor por defecto
     */
	public Compra() {
		this.idFactura = 0;
		this.idProducto = 0;
	}
	
	/**
	 * @param idFactura El id de la factura de la compra
	 * @param idProducto El id del producto de la compra
	 */
	public Compra(long idFactura, long idProducto) {
		this.idFactura = idFactura;
		this.idProducto = idProducto;
	}

	/**
	 * @return the idFactura
	 */
	public long getIdFactura() {
		return idFactura;
	}

	/**
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * @return the idProducto
	 */
	public long getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la factura.
	 */
	public String toString() {
		return "Compra [idFactura=" + idFactura + ", idProducto=" + idProducto + "]";
	}
	
}
