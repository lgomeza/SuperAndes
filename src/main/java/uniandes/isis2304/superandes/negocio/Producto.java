package uniandes.isis2304.superandes.negocio;

import java.util.Date;

public class Producto implements VOProducto{
    /* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El nombre del producto
	 */
	private String nombre;
	
	/**
	 * La marca del producto.
	 */
	private String marca;

	/**
	 * El código de barras del producto
	 */
	private String codigoBarras;
	
	/**
	 * El precio unitario del producto.
	 */
    private double precioUnitario;
    
    /**
	 * El precio de compra del producto.
	 */
    private double precioCompra;

    /**
	 * La presentacion del producto.
	 */
    private String presentacion;

    /**
	 * La cantidad en la presentacion del producto.
	 */
    private double cantidadPresentacion;

    /**
	 * La unidad de medida del producto.
	 */
    private String unidadMedida;

    /**
	 * La especificación de empacado del producto.
	 */
    private String especificacionEmpacado;

     /**
	 * El tipo del producto.
	 */
    private String tipo;

     /**
	 * La fecha de vencimiento del producto.
	 */
    private Date fechaVencimiento;

	/**
     * El id de la bodega en la que se encuentra el producto
     */
    private long idBodega;

    /**
     * El id del estante en el que se encuentra el producto
     */
    private long idEstante;
    
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
    public Producto() {
		this.nombre = "";
		this.marca = "";
		this.codigoBarras = "";
		this.precioUnitario = 0;
		this.precioCompra = 0;
		this.presentacion = "";
		this.cantidadPresentacion = 0;
		this.unidadMedida = "";
		this.especificacionEmpacado = "";
		this.tipo = "";
		this.fechaVencimiento = new Date();
		this.idBodega = 0;
		this.idEstante = 0;
    }
    
    /**
	 * @param nombre El nombre del producto
	 * @param marca La marca del producto
	 * @param codigoBarras El codigo de barras del producto
	 * @param precioUnitario El precio unitario del producto
	 * @param precioCompra El precio de compra del producto
	 * @param presentacion La presentacion del producto
	 * @param cantidadPresentacion La cantidad de la presentacion del producto
	 * @param unidadMedida La unidad de medida del producto
	 * @param especificacionEmpacado La especificacion de empacado del producto
	 * @param tipo El tipo del producto
	 * @param fechaVencimiento La fecha de vencimiento del producto
	 * @param idBodega El id de la bodega en la que se encuentra el producto
	 * @param idEstante El id del estante en el que se encuentra el producto
	 */
	public Producto(String nombre, String marca, String codigoBarras, double precioUnitario, double precioCompra,
			String presentacion, double cantidadPresentacion, String unidadMedida, String especificacionEmpacado,
			String tipo, Date fechaVencimiento, long idBodega, long idEstante) {
		this.nombre = nombre;
		this.marca = marca;
		this.codigoBarras = codigoBarras;
		this.precioUnitario = precioUnitario;
		this.precioCompra = precioCompra;
		this.presentacion = presentacion;
		this.cantidadPresentacion = cantidadPresentacion;
		this.unidadMedida = unidadMedida;
		this.especificacionEmpacado = especificacionEmpacado;
		this.tipo = tipo;
		this.fechaVencimiento = fechaVencimiento;
		this.idBodega = idBodega;
		this.idEstante = idEstante;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the codigoBarras
	 */
	public String getCodigoBarras() {
		return codigoBarras;
	}

	/**
	 * @param codigoBarras the codigoBarras to set
	 */
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	/**
	 * @return the precioUnitario
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the presentacion
	 */
	public String getPresentacion() {
		return presentacion;
	}

	/**
	 * @param presentacion the presentacion to set
	 */
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	/**
	 * @return the cantidadPresentacion
	 */
	public double getCantidadPresentacion() {
		return cantidadPresentacion;
	}

	/**
	 * @param cantidadPresentacion the cantidadPresentacion to set
	 */
	public void setCantidadPresentacion(double cantidadPresentacion) {
		this.cantidadPresentacion = cantidadPresentacion;
	}

	/**
	 * @return the unidadMedida
	 */
	public String getUnidadMedida() {
		return unidadMedida;
	}

	/**
	 * @param unidadMedida the unidadMedida to set
	 */
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	/**
	 * @return the especificacionEmpacado
	 */
	public String getEspecificacionEmpacado() {
		return especificacionEmpacado;
	}

	/**
	 * @param especificacionEmpacado the especificacionEmpacado to set
	 */
	public void setEspecificacionEmpacado(String especificacionEmpacado) {
		this.especificacionEmpacado = especificacionEmpacado;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the fechaVencimiento
	 */
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	/**
	 * @param fechaVencimiento the fechaVencimiento to set
	 */
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	/**
	 * @return the idBodega
	 */
	public long getIdBodega() {
		return idBodega;
	}

	/**
	 * @param idBodega the idBodega to set
	 */
	public void setIdBodega(long idBodega) {
		this.idBodega = idBodega;
	}

	/**
	 * @return the idEstante
	 */
	public long getIdEstante() {
		return idEstante;
	}

	/**
	 * @param idEstante the idEstante to set
	 */
	public void setIdEstante(long idEstante) {
		this.idEstante = idEstante;
	}

    @Override
	/**
	 * @return Una cadena de caracteres con todos los atributos del producto.
	 */
	public String toString() {
		return "Producto [nombre=" + nombre + ", marca=" + marca + ", codigo de barras=" + codigoBarras + ", precio unitario=" + precioUnitario + ", precio compra=" + precioCompra
				+ ", presentacion=" + presentacion + ", cantidad presentacion=" + cantidadPresentacion + ", unidad de medida=" + unidadMedida+ ", especificacion de empacado=" + especificacionEmpacado
				+ ", tipo=" + tipo + ", precio unitario=" + precioUnitario + ", fecha de vencimiento=" + fechaVencimiento.toString() + ", id de la bodega=" + idBodega + ", id del estante=" + idEstante + "]";
	}

}
