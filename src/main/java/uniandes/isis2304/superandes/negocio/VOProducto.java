package uniandes.isis2304.superandes.negocio;

import java.util.Date;

public interface VOProducto {
	/**
	 * @return the nombre
	 */
	public String getNombre();

	/**
	 * @return the marca
	 */
	public String getMarca();

	/**
	 * @return the codigoBarras
	 */
	public String getCodigoBarras();

	/**
	 * @return the precioUnitario
	 */
	public double getPrecioUnitario();

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra();

	/**
	 * @return the presentacion
	 */
	public String getPresentacion();
	/**
	 * @return the cantidadPresentacion
	 */
	public double getCantidadPresentacion();

	/**
	 * @return the unidadMedida
	 */
	public String getUnidadMedida();

	/**
	 * @return the especificacionEmpacado
	 */
	public String getEspecificacionEmpacado();

	/**
	 * @return the tipo
	 */
	public String getTipo();

	/**
	 * @return the fechaVencimiento
	 */
	public Date getFechaVencimiento();

	/**
	 * @return the idBodega
	 */
	public long getIdBodega();

	/**
	 * @return the idEstante
	 */
	public long getIdEstante();

    @Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del producto.
	 */
	public String toString();
}
