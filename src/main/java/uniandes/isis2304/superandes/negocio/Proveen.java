package uniandes.isis2304.superandes.negocio;

public class Proveen {
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id del proveedor
	 */
	private long idProveedor;

	/**
	 * El id del producto provisto
	 */
	private long idProducto;

	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/

    /**
     * Constructor por defecto
     */
	public Proveen() {
		this.idProveedor = 0;
		this.idProducto = 0;
	}
	
	/**
	 * @param idProveedor El id del proveedor
	 * @param idProducto El id del producto provisto
	 */
	public Proveen(long idProveedor, long idProducto) {
		this.idProveedor = idProveedor;
		this.idProducto = idProducto;
	}

	/**
	 * @return the idProveedor
	 */
	public long getIdProveedor() {
		return idProveedor;
	}

	/**
	 * @param idProveedor the idProveedor to set
	 */
	public void setIdProveedor(long idProveedor) {
		this.idProveedor = idProveedor;
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
	 * @return Una cadena de caracteres con todos los atributos de "Proveen".
	 */
	public String toString() {
		return "Proveen idProveedor=" + idProveedor + ", idProducto=" + idProducto + "]";
	}
}
