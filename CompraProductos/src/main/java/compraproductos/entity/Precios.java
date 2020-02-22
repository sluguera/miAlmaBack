package compraproductos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "precio")
public class Precios {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="idproducto")
	private int idProducto;
	
	@Column(name ="valor")
	private double precio;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
