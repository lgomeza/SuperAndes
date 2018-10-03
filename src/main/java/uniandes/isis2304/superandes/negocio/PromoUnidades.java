package uniandes.isis2304.superandes.negocio;

public class PromoUnidades implements VOPromoUnidades{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id de la promocion
	 */
	private long idPromo;
	
	/**
	 * La cantidad de unidades que se paga
	 */
	private int pague;

	/**
	 * La cantidad de unidades que realmente se lleva
	 */
	private int lleve;
	
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public PromoUnidades() {
		this.idPromo = 0;
		this.pague = 0;
		this.lleve = 0;
	}
	
	/**
	 * @param idPromo El id de la promocion
	 * @param pague La cantidad de unidades que se paga
	 * @param lleve La cantidad de unidades que realmente se lleva
	 */
	public PromoUnidades(long idPromo, int pague, int lleve) {
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
	public int getPague() {
		return pague;
	}

	/**
	 * @param pague the pague to set
	 */
	public void setPague(int pague) {
		this.pague = pague;
	}

	/**
	 * @return the lleve
	 */
	public int getLleve() {
		return lleve;
	}

	/**
	 * @param lleve the lleve to set
	 */
	public void setLleve(int lleve) {
		this.lleve = lleve;
	}
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion por unidades.
	 */
	public String toString() {
		return "PromoUnidades [id=" + idPromo + ", pague=" + pague + ", lleve=" + lleve  +  "]";
	}
}
