package es.us.dp1.games.ajedrez.repository;

import org.springframework.data.repository.CrudRepository;

import es.us.dp1.games.ajedrez.model.Authorities;



public interface AuthoritiesRepository extends  CrudRepository<Authorities, String>{
	
}
