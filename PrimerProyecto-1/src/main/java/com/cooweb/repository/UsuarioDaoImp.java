package com.cooweb.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cooweb.models.Usuario;
@PersistenceContext
private EntityManager entityManager;

@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao {

	@Override
	public List<Usuario> obtenerUsuarios() {
		
		String query="from Usuario";
		
		return entityManager.creteQuery(query).getResultList();
	
	
	}

}
