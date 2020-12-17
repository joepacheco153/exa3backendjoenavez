package pe.edu.upeu.exa3backendjoenavez.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exa3backendjoenavez.dao.VentaDao;
import pe.edu.upeu.exa3backendjoenavez.entity.Venta;
import pe.edu.upeu.exa3backendjoenavez.service.VentaService;
@Service
public class VentaServiceImpl implements VentaService{
	@Autowired
	private VentaDao ventadao;
	@Override
	public int create(Venta v) {
		// TODO Auto-generated method stub
		return ventadao.create(v);
	}

	@Override
	public int update(Venta v) {
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
	public Venta read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAllV() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return ventadao.readAll();
	}

}
