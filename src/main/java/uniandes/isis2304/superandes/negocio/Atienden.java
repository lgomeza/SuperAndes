package uniandes.isis2304.superandes.negocio;

public class Atienden {
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id del proveedor
	 */
	private long idProveedor;
	
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
	public Atienden() {
		this.idProveedor = 0;
		this.dirSucursal = "";
		this.ciudadSucursal = "";
	}
	
	/**
	 * @param idProveedor El id del proveedor
	 * @param dirSucursal La direccion de la sucursal a la que atiende
	 * @param ciudadSucursal La ciudad de la sucursal a la que atiende
	 */
	public Atienden(long idProveedor, String dirSucursal, String ciudadSucursal) {
		this.idProveedor = idProveedor;
		this.dirSucursal = dirSucursal;
		this.ciudadSucursal = ciudadSucursal;
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
	 * @return Una cadena de caracteres con todos los atributos de "Atienden".
	 */
	public String toString() {
		return "Atienden idProveedor=" + idProveedor + ",dirSucursal=" + dirSucursal + ", ciudadSucursal=" + ciudadSucursal + "]";
	}
}
