package uniandes.isis2304.superandes.negocio;

public class Venden {
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id del producto
	 */
	private long idProducto;
	
	/**
	 * La dirección de la sucursal a la que atiende
	 */
	private String dirSucursal;
	
	/**
	 * La ciudad de la sucursal a la que atiende
	 */
	private String ciudadSucursal;

	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/

    /**
     * Constructor por defecto
     */
	public Venden() {
		this.idProducto = 0;
		this.dirSucursal = "";
		this.ciudadSucursal = "";
	}
	
	/**
	 * @param idProducto El id del producto
	 * @param dirSucursal La direccion de la sucursal a la que atiende
	 * @param ciudadSucursal La ciudad de la sucursal a la que atiende
	 */
	public Venden(long idProducto, String dirSucursal, String ciudadSucursal) {
		this.idProducto = idProducto;
		this.dirSucursal = dirSucursal;
		this.ciudadSucursal = ciudadSucursal;
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

	/**
	 * @return the dirSucursal
	 */
	public String getDirSucursal() {
		return dirSucursal;
	}

	/**
	 * @param dirSucursal the dirSucursal to set
	 */
	public void setDirSucursal(String dirSucursal) {
		this.dirSucursal = dirSucursal;
	}

	/**
	 * @return the ciudadSucursal
	 */
	public String getCiudadSucursal() {
		return ciudadSucursal;
	}

	/**
	 * @param ciudadSucursal the ciudadSucursal to set
	 */
	public void setCiudadSucursal(String ciudadSucursal) {
		this.ciudadSucursal = ciudadSucursal;
	}
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de "Venden".
	 */
	public String toString() {
		return "Atienden idProducto=" + idProducto + ",dirSucursal=" + dirSucursal + ", ciudadSucursal=" + ciudadSucursal + "]";
	}
}
