package pe.edu.upeu.exa3backendjoenavez.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.exa3backendjoenavez.entity.Detalle_venta;



public interface DetalleVentaDao {
	int create(Detalle_venta d);
	int update(Detalle_venta d);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> readAll2(int idventa);
	List<Detalle_venta> readAll();

}
