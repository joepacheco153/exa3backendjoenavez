package pe.edu.upeu.exa3backendjoenavez.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.exa3backendjoenavez.entity.Venta;



public interface VentaDao {
	int create(Venta v);
	int update(Venta v);
	int update(int id);
	int delete(int id);
	Venta read(int id);
	Map<String, Object> readAllV();
	List<Venta> readAll();

}
