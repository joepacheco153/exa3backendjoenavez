package pe.edu.upeu.exa3backendjoenavez.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.exa3backendjoenavez.dao.DetalleVentaDao;
import pe.edu.upeu.exa3backendjoenavez.entity.Detalle_venta;

@Repository
public class DetalleVentaDaoImpl implements DetalleVentaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Detalle_venta d) {
		String SQL = "insert into detalle_ventas (precio, cantidad, idventa, idproducto)";
		return jdbcTemplate.update(SQL, new Object [] {d.getPrecio(), d.getCantidad(), d.getIdventa(), d.getIdproducto()});
	}

	@Override
	public int update(Detalle_venta d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> readAll2(int idventa) {
		// TODO Auto-generated method stub
		String SQL = "select *  from  detalle_ventas where idventa =?; ";
		return jdbcTemplate.queryForList(SQL, idventa);
	}

	@Override
	public List<Detalle_venta> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
