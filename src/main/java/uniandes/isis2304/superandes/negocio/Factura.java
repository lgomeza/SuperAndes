package uniandes.isis2304.superandes.negocio;

import java.util.Date;

public class Factura implements VOFactura{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id de la factura
	 */
	private long id;
	
	/**
	 * La fecha en que se generó la factura
	 */
	private Date fechaGenerada;

	/**
	 * El valor total de la factura.
	 */
	private double valorTotal;
	
	/**
	 * El id del cliente al que se le hace la factura.
	 */
	private long idCliente;

	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Factura() {
		this.id = 0;
		this.fechaGenerada = new Date();
		this.valorTotal = 0;
		this.idCliente = 0;
	}
	
	/**
	 * @param id El id de la factura
	 * @param fechaGenerada La fecha en que la factura fue generada
	 * @param valorTotal El valor total de la factura
	 * @param idCliente El id del cliente 
	 */
	public Factura(long id, Date fechaGenerada, double valorTotal, long idCliente) {
		this.id = id;
		this.fechaGenerada = fechaGenerada;
		this.valorTotal = valorTotal;
		this.idCliente = idCliente;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fechaGenerada
	 */
	public Date getFechaGenerada() {
		return fechaGenerada;
	}

	/**
	 * @param fechaGenerada the fechaGenerada to set
	 */
	public void setFechaGenerada(Date fechaGenerada) {
		this.fechaGenerada = fechaGenerada;
	}

	/**
	 * @return the valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the idCliente
	 */
	public long getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la factura.
	 */
	public String toString() {
		return "Factura [id=" + id + ", fecha generada=" + fechaGenerada + ", valor total=" + valorTotal + ", idCliente=" + idCliente + "]";
	}

}
