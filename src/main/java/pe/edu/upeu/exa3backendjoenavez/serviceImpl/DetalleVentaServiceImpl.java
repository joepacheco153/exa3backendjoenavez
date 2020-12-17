package pe.edu.upeu.exa3backendjoenavez.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exa3backendjoenavez.dao.DetalleVentaDao;
import pe.edu.upeu.exa3backendjoenavez.entity.Detalle_venta;
import pe.edu.upeu.exa3backendjoenavez.service.DetalleVentaService;
@Service
public class DetalleVentaServiceImpl implements DetalleVentaService{
	@Autowired
	private DetalleVentaDao dvDao;
	@Override
	public int create(Detalle_venta d) {
		// TODO Auto-generated method stub
		return dvDao.create(d);
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
		return dvDao.readAll2(idventa);
	}

	@Override
	public List<Detalle_venta> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
