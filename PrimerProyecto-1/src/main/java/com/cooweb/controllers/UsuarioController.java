package com.cooweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.models.Column;
import com.cooweb.models.Usuario;
import com.cooweb.repository.UsuarioDao;

@RestController

public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "hola mundo";
		
	}
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Diego","Juan","Jose");
			
	}
	@RequestMapping(value="usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Carlos");
		usuario.setApellido("Quispe");
		usuario.setEmail("quispecarlos2004@gmail.com");
		usuario.setTelefono("2615359921");
		
		return null;
	}
	@RequestMapping(value="usuario/lista_user")
	public List<Usuario> listar_variosUsuarios() {
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Carlos");
		usuario1.setApellido("Quispe");
		usuario1.setEmail("quispecarlos2004@gmail.com");
		usuario1.setTelefono("2615359921");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Julian");
		usuario2.setApellido("Quispe");
		usuario2.setEmail("julian123@gmail.com");
		usuario2.setTelefono("2615359341");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);

		return usuarios;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		
		return user;
	}
}
