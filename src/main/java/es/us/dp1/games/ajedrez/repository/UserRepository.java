package es.us.dp1.games.ajedrez.repository;

import org.springframework.data.repository.CrudRepository;

import es.us.dp1.games.ajedrez.model.User;


public interface UserRepository extends  CrudRepository<User, String>{
	
}
