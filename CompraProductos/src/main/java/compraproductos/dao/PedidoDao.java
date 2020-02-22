package compraproductos.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import compraproductos.entity.Pedido;
import compraproductos.entity.Reporte;

public interface PedidoDao extends CrudRepository<Pedido, Integer> {
	
	@Procedure("registrarPedido")
	void registrarPedido(@Param("idproducto") int idProducto, @Param("idcliente") String idCliente,
			@Param("fechacompra") Date fechaCompra, @Param("detalle") String detalle);

	
	@Procedure("editarPedido")
	void editarPedido(@Param("id") int idPedido, @Param("idproducto") int idProducto, @Param("idcliente") String idCliente,
			@Param("fechacompra") Date fechaCompra, @Param("detalle") String detalle);

	
	@Procedure("eliminarPedido")
	void eliminarPedido(@Param("id") int idPedido);

	
	@Procedure("consultarPedidoPorIdCliente")
	List<Pedido> consultarPedidoPorIdCliente(@Param("id") String idCliente);

	
	@Procedure("consultarPedidoPorIdProducto")
	List<Pedido> consultarPedidoPorIdProducto(@Param("id") int idProducto);

	
	@Procedure("consultarPedidoPorFecha")
	List<Reporte> consultarPedidoPorFecha(@Param("fechainicial") String fechaInicial, @Param("fechafinal") String fechaFinal);

}
