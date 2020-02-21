package compraproductos.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import compraproductos.dao.PedidoDao;
import compraproductos.entity.Pedido;
import compraproductos.entity.Reporte;

@Service
public class PedidoServices {
	@Autowired
	private PedidoDao daoPedido;

	// Crear un pedido
	public void crearPedido(Pedido pedido) {
		 daoPedido.registrarPedido(pedido.getIdProducto(), pedido.getCedulaCliente(), pedido.getFechaCompraPedido(), pedido.getDetallePedido());
	}

	// Consultar todos los pedidos
	public List<Pedido> consultarPedidos() {
		return (List<Pedido>) daoPedido.findAll();
	}
	public Pedido consultarPedido(int idPedido) {
		Optional<Pedido> pedido = daoPedido.findById(idPedido);
		if (pedido.isPresent()) {
			return pedido.get();
		}
		return null;
	}

	// consultar pedidos del cliente
	public List<Pedido> consultarPedidoCliente(String cedulaCliente) {
		return daoPedido.consultarPedidoPorIdCliente(cedulaCliente);
	}

	// consultar pedidos del producto
	public List<Pedido> consultarPedidoProducto(int idProducto) {
		return daoPedido.consultarPedidoPorIdProducto(idProducto);
	}

	// Consultar pedidos entre fechas
	public List<Reporte> consultarPedidosPorFecha(String fechaInit, String fechaEnd) {
		return daoPedido.consultarPedidoPorFecha(fechaInit, fechaEnd);
	}

	// Actualizar pedido 
	@SuppressWarnings("unchecked")
	public void actualizarPedido(Pedido pedido) {
		 daoPedido.editarPedido(pedido.getIdPedido(),pedido.getIdProducto(), pedido.getCedulaCliente(), pedido.getFechaCompraPedido(), pedido.getDetallePedido());
	}

	// Eliminar un pedido
	public void borrarPedido(Pedido pedido) {
		daoPedido.eliminarPedido(pedido.getIdPedido());
	}

}
