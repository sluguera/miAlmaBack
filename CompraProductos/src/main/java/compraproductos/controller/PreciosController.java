package compraproductos.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import compraproductos.entity.Precios;
import compraproductos.services.PreciosServices;

@RestController
@RequestMapping("api/precios/")
@CrossOrigin
public class PreciosController {
	@Autowired
	private PreciosServices preciosServices;
	
	@GetMapping("consultar")
	public ResponseEntity<List<Precios>> consultarPrecios(){
		return new ResponseEntity<>(preciosServices.consultarPrecio(), HttpStatus.OK);
	}

}
