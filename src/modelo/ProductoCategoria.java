package modelo;

public class ProductoCategoria {
	/* Atributos Tabla Producto */
	private int idProducto;
	private String platillo;
	private String codigo;
	private String precio;
	private String cantidad;
	private String ingredientes;
	private int codigoCategoria;
	/* ************************* */
	
	
	
	/* Getters and Setters Tabla Producto */
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getPlatillo() {
		return platillo;
	}
	public void setPlatillo(String platillo) {
		this.platillo = platillo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public int getCodigoCategoria() {
		return codigoCategoria;
	}
	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	/* ****************************************************** */
	
	
	
	
	
	/* Atributos Tabla Categoria */
	private int idCategoria;
	private String categoria;
	private String descripcion;
	/* ************************* */
	
	
	/* Getters and Setters Tabla Categoria */
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/* ******************************************* */
	
}