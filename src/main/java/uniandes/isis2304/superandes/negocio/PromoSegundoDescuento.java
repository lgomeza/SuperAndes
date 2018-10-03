package uniandes.isis2304.superandes.negocio;

public class PromoSegundoDescuento {
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
	 * El porcentaje de descuento aplicado al segundo producto
	 */
	private double lleveSegundoA;
	
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public PromoSegundoDescuento() {
		this.idPromo = 0;
		this.pague = 0;
		this.lleveSegundoA = 0;
	}
	
	/**
	 * @param idPromo El id de la promocion
	 * @param pague La cantidad que se paga
	 * @param lleveSegundoA El porcentaje de descuento aplicado al segundo producto
	 */
	public PromoSegundoDescuento(long idPromo, double pague, double lleveSegundoA) {
		this.idPromo = idPromo;
		this.pague = pague;
		this.lleveSegundoA = lleveSegundoA;
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
	 * @return the lleveSegundoA
	 */
	public double getLleveSegundoA() {
		return lleveSegundoA;
	}

	/**
	 * @param lleveSegundoA the lleveSegundoA to set
	 */
	public void setLleveSegundoASegundoA(double lleveSegundoA) {
		this.lleveSegundoA = lleveSegundoA;
	}
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion para llevar el segundo a cierto porcentaje de descuento.
	 */
	public String toString() {
		return "PromoSegundoDescuento [id=" + idPromo + ", pague=" + pague + ", lleveSegundoA=" + lleveSegundoA  +  "]";
	}
}
