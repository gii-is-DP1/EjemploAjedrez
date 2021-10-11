package es.us.dp1.games.chess.repository;

import org.springframework.data.repository.CrudRepository;

import es.us.dp1.games.chess.model.Authorities;



public interface AuthoritiesRepository extends  CrudRepository<Authorities, String>{
	
}
