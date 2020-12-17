package pe.edu.upeu.exa3backendjoenavez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.exa3backendjoenavez.entity.Venta;
import pe.edu.upeu.exa3backendjoenavez.service.VentaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping("/ventas")
public class VentaController {
@Autowired
private VentaService ventaService;

@GetMapping("/all")
public List<Venta> readList(){
	return ventaService.readAll();
}
@PostMapping("/add")
public int create(@RequestBody Venta v) {
	return ventaService.create(v);
}


}
