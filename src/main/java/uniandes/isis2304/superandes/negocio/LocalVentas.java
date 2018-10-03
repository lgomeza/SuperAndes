package uniandes.isis2304.superandes.negocio;

import java.util.ArrayList;
import java.util.List;

public class LocalVentas {

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El id del local de ventas.
	 */
	private long id;
	
	/**
	 * La cantidad de cajas del local de ventas.
	 */
	private int cantidadDeCajas;

	/**
	 * La capacidad máxima que tiene el local de ventas.
	 */
	private double capacidadMaxima;


	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public LocalVentas() 
    {
    		this.cantidadDeCajas = 0;
		this.capacidadMaxima = 0;
	}
	
	/**
	 * Constructor con valores
	 * @param cantidadDeCajas - El cantidadDeCajas de la categoría
	 * @param capacidadMaxima - La descripción de la categoría.
	 */
    public LocalVentas(int cantidadDeCajas, double capacidadMaxima) 
    {
    		this.cantidadDeCajas = cantidadDeCajas;
		this.capacidadMaxima = capacidadMaxima;
	}

	/**
	 * @return El cantidadDeCajas de la categoria
	 */
	public int getCantidadDeCajas() {
		return cantidadDeCajas;
	}

	public void setCantidadDeCajas(int cantidadDeCajas) {
		this.cantidadDeCajas = cantidadDeCajas;
	}

	/**
	 * @return El cantidadDeCajas de la descripción
	 */
	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
    
	@Override
	/**
	 * @return Una cadena de caracteres con todos los atributos de la bodega.
	 */
	public String toString() {
		return "Categoria [cantidadDeCajas=" + cantidadDeCajas + ", capacidadMaxima=" + capacidadMaxima + "]";
	}
}
