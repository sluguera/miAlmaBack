package compraproductos.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import compraproductos.entity.Precios;

public interface PreciosDao extends CrudRepository<Precios, Integer> {

	@Procedure(name = "consultaProductoConPrecio")
	Optional<Precios> consultaProductoConPrecio(@Param("idproducto") int idProducto);
	
	@Procedure(name = "registrarPrecio")
	void registrarPrecio(@Param("valor") double valor);
	
	@Procedure(name = "eliminarPrecio")
	void eliminarPrecio(@Param("id") int id);
	
	
	@Procedure(name = "actualizarPrecio")
	void actualizarPrecio(@Param("id") int id, @Param("precio") double precio);
}
