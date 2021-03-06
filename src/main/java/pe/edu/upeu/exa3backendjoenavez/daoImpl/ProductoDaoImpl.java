package pe.edu.upeu.exa3backendjoenavez.daoImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.exa3backendjoenavez.dao.ProductoDao;
import pe.edu.upeu.exa3backendjoenavez.entity.Producto;
import pe.edu.upeu.exa3backendjoenavez.entity.Rol;
@Component
public class ProductoDaoImpl implements ProductoDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
Gson gson = new Gson();
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PK_PRODUCTOS.sp_insertar_productos(?,?,?)", p.getNomprod(),p.getPrecio(), p.getStock());
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
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_PRODUCTOS")
				.withProcedureName("sp_listar_productos")
				.declareParameters(new SqlOutParameter("cursor_productos", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));
				Map<String, Object> map = simpleJdbcCall.execute();
		return map;
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from producto where idproducto = ?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, BeanPropertyRowMapper.newInstance(Producto.class) );
		
	}

}
