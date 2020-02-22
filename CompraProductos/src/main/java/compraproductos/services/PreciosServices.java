package compraproductos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import compraproductos.dao.PreciosDao;
import compraproductos.entity.Precios;

@Service
public class PreciosServices {
	@Autowired
	private PreciosDao preciosDao;


	// Consultar todos los precios
	public List<Precios> consultarPrecio() {
		return (List<Precios>) preciosDao.findAll();
	}

	
	public void registrar(Precios precios) {
		preciosDao.registrarPrecio(precios.getPrecio());
	}
	
	public void eliminar(Precios precios) {
		preciosDao.eliminarPrecio(precios.getIdProducto());
	}
	
	public void actualizar(Precios precios) {
		preciosDao.actualizarPrecio(precios.getIdProducto(),precios.getPrecio());
	}
}
