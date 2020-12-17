package pe.edu.upeu.exa3backendjoenavez.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.exa3backendjoenavez.dao.VentaDao;
import pe.edu.upeu.exa3backendjoenavez.entity.Venta;
@Repository
public class VentaDaoImpl implements VentaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Venta v) {
		// TODO Auto-generated method stub
		String SQL = "insert into venta (fecha,tipodoc,numdoc,idpersona,idusuario)";
		return jdbcTemplate.update(SQL, new Object[] {v.getFecha(), v.getTipodoc(),v.getNumdoc(),v.getIdpersona(),v.getIdusuario()});
	}
	
	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from ventas",BeanPropertyRowMapper.newInstance(Venta.class));
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

	
	
	

}
