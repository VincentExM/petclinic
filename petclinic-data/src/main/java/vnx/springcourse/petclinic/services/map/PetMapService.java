package vnx.springcourse.petclinic.services.map;

import java.util.*;

import org.springframework.stereotype.*;
import vnx.springcourse.petclinic.model.*;
import vnx.springcourse.petclinic.services.*;

@Service
public class PetMapService extends AbstractMapService<Pet, UUID> implements PetService {

	@Override
	public Set<Pet> findAll() {

		return super.findAll();
	}

	@Override
	public void deleteById(UUID id) {

		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {

		super.delete(object);
	}

	@Override
	public Pet save(Pet object) {

		return super.save(object.getId(), object);
	}

	@Override
	public Pet findById(UUID id) {

		return super.findById(id);
	}
}
