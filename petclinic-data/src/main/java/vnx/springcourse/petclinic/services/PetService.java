package vnx.springcourse.petclinic.services;

import java.util.*;

import vnx.springcourse.petclinic.model.*;

public interface PetService {

	Pet findById(UUID id);

	Pet save(Owner owner);

	Set<Pet> findAll();

}
