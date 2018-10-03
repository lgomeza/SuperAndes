package uniandes.isis2304.superandes.negocio;

public class PromoPorcentaje implements VOPromoPorcentaje{
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
	private double porcentajeDcto;

	
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public PromoPorcentaje() {
		this.idPromo = 0;
		this.porcentajeDcto = 0;
	}
	
	/**
	 * @param idPromo El id de la promocion
	 * @param porcentajeDcto La cantidad que se paga
	 */
	public PromoPorcentaje(long idPromo, double porcentajeDcto) {
		this.idPromo = idPromo;
		this.porcentajeDcto = porcentajeDcto;
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
	 * @return the porcentajeDcto
	 */
	public double getPorcentajeDcto() {
		return porcentajeDcto;
	}

	/**
	 * @param porcentajeDcto the porcentajeDcto to set
	 */
	public void setPorcentajeDcto(double porcentajeDcto) {
		this.porcentajeDcto = porcentajeDcto;
	}
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la promocion por cantidad.
	 */
	public String toString() {
		return "PromoPorcentaje [id=" + idPromo + ", porcentaje descuento=" + porcentajeDcto +  "]";
	}
}
