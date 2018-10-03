package uniandes.isis2304.superandes.negocio;

public class PromoCantidad implements VOPromoCantidad {
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id de la promocion
	 */
	private long idPromo;
	
	/**
	 * La cantidad que se paga
	 */
	private double pague;

	/**
	 * La cantidad que realmente se lleva
	 */
	private double lleve;
	
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public PromoCantidad() {
		this.idPromo = 0;
		this.pague = 0;
		this.lleve = 0;
	}
	
	/**
	 * @param idPromo El id de la promocion
	 * @param pague La cantidad que se paga
	 * @param lleve La cantidad que realmente se lleva
	 */
	public PromoCantidad(long idPromo, double pague, double lleve) {
		this.idPromo = idPromo;
		this.pague = pague;
		this.lleve = lleve;
	}

	/**
	 * @return the idPromo
	 */
	public long getIdPromo() {
		return idPromo;
	}

	/**
	 * @param idPromo the idPromo to set
	 */
	public void setIdPromo(long idPromo) {
		this.idPromo = idPromo;
	}

	/**
	 * @return the pague
	 */
	public double getPague() {
		return pague;
	}

	/**
	 * @param pague the pague to set
	 */
	public void setPague(double pague) {
		this.pague = pague;
	}

	/**
	 * @return the lleve
	 */
	public double getLleve() {
		return lleve;
	}

	/**
	 * @param lleve the lleve to set
	 */
	public void setLleve(double lleve) {
		this.lleve = lleve;
	}
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion por cantidad.
	 */
	public String toString() {
		return "PromoCantidad [id=" + idPromo + ", pague=" + pague + ", lleve=" + lleve  +  "]";
	}
	
	
}
