/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.us.dp1.games.ajedrez.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import es.us.dp1.games.ajedrez.model.Owner;
import es.us.dp1.games.ajedrez.model.Pet;
import es.us.dp1.games.ajedrez.model.PetType;
import es.us.dp1.games.ajedrez.model.Vet;
import es.us.dp1.games.ajedrez.model.Visit;
import es.us.dp1.games.ajedrez.repository.OwnerRepository;
import es.us.dp1.games.ajedrez.repository.PetRepository;
import es.us.dp1.games.ajedrez.repository.VetRepository;
import es.us.dp1.games.ajedrez.repository.VisitRepository;
import es.us.dp1.games.ajedrez.service.exceptions.DuplicatedPetNameException;

/**
 * Mostly used as a facade for all Petclinic controllers Also a placeholder
 * for @Transactional and @Cacheable annotations
 *
 * @author Michael Isvy
 */
@Service
public class OwnerService {

	private OwnerRepository ownerRepository;	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthoritiesService authoritiesService;

	@Autowired
	public OwnerService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}	

	@Transactional(readOnly = true)
	public Owner findOwnerById(int id) throws DataAccessException {
		return ownerRepository.findById(id);
	}

	@Transactional(readOnly = true)
	public Collection<Owner> findOwnerByLastName(String lastName) throws DataAccessException {
		return ownerRepository.findByLastName(lastName);
	}

	@Transactional
	public void saveOwner(Owner owner) throws DataAccessException {
		//creating owner
		ownerRepository.save(owner);		
		//creating user
		userService.saveUser(owner.getUser());
		//creating authorities
		authoritiesService.saveAuthorities(owner.getUser().getUsername(), "owner");
	}		

}