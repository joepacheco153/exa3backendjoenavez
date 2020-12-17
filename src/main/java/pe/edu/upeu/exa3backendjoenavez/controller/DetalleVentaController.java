package pe.edu.upeu.exa3backendjoenavez.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.exa3backendjoenavez.entity.Detalle_venta;
import pe.edu.upeu.exa3backendjoenavez.service.DetalleVentaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping("/detalleventas")
public class DetalleVentaController {
	@Autowired
	private DetalleVentaService dvService;
	
	@GetMapping("/all2/{idventa}")
	public List<Map<String, Object>> readAll(@PathVariable int idventa){
		return dvService.readAll2(idventa);
	}
	@PutMapping("/add")
	public int create (@RequestBody Detalle_venta d) {
		return dvService.create(d);
				
	}

}
