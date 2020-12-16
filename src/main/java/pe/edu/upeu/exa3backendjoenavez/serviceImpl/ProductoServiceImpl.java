package pe.edu.upeu.exa3backendjoenavez.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exa3backendjoenavez.dao.ProductoDao;
import pe.edu.upeu.exa3backendjoenavez.entity.Producto;
import pe.edu.upeu.exa3backendjoenavez.service.ProductoService;
@Service
public class ProductoServiceImpl implements ProductoService {
@Autowired
private ProductoDao prodDao;
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return prodDao.create(p);
	}

	@Override
	public int update(Producto p) {
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
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return prodDao.readAll();
	}

}
