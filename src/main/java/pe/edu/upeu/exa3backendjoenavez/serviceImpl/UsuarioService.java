package pe.edu.upeu.exa3backendjoenavez.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import pe.edu.upeu.exa3backendjoenavez.dao.RolDao;
import pe.edu.upeu.exa3backendjoenavez.dao.UsuarioDao;
import pe.edu.upeu.exa3backendjoenavez.entity.Usuario;


@Service("userService")
public class UsuarioService implements UserDetailsService{
	Gson g = new Gson();
   @Autowired
	private UsuarioDao usuarioDao;
   @Autowired
	private RolDao rolDao;
   
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		Usuario usuario = usuarioDao.validarUsuario(username);
		UserDetails details = new User(usuario.getUsername(),usuario.getPassword(),rolDao.buscarRolUser(usuario.getIdusuario()));
		return details;
	}

}
