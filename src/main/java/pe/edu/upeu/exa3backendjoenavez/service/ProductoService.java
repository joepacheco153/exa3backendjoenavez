package pe.edu.upeu.exa3backendjoenavez.service;

import java.util.Map;

import pe.edu.upeu.exa3backendjoenavez.entity.Producto;

public interface ProductoService {
	int create(Producto p);
	int update(Producto p);
	int update(int id);
	int delete(int id);
	Producto read (int id);
	Map<String, Object> readAll();
}
