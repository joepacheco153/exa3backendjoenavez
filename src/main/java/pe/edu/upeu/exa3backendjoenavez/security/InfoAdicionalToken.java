package pe.edu.upeu.exa3backendjoenavez.security;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import pe.edu.upeu.exa3backendjoenavez.dao.AccesosDao;
import pe.edu.upeu.exa3backendjoenavez.dao.PersonaDao;
import pe.edu.upeu.exa3backendjoenavez.dao.UsuarioDao;
import pe.edu.upeu.exa3backendjoenavez.entity.Persona;
import pe.edu.upeu.exa3backendjoenavez.entity.Usuario;


@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private AccesosDao accesoDao;
	@Autowired
	private PersonaDao personaDao;
Gson g = new Gson();
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Usuario user = usuarioDao.read(authentication.getName());
		Persona per = personaDao.read(user.getIdpersona());
		Map<String, Object> datos= new HashMap<>();
		datos.put("iduser", user.getIdusuario());
		datos.put("nombre", per.getNombres());
		datos.put("user", user.getUsername());
		datos.put("acceso", accesoDao.readAll(authentication.getName()));
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(datos);

		return accessToken;
	}

}
