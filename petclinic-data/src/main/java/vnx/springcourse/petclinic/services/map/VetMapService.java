package vnx.springcourse.petclinic.services.map;

import java.util.*;

import vnx.springcourse.petclinic.model.*;
import vnx.springcourse.petclinic.services.*;

public class VetMapService extends AbstractMapService<Vet, UUID> implements CrudService<Vet, UUID> {

	@Override
	public Set<Vet> findAll() {

		return super.findAll();
	}

	@Override
	public void delete(Vet object) {

		super.delete(object);
	}

	@Override
	public Vet save(Vet object) {

		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(UUID id) {

		super.deleteById(id);
	}

	@Override
	public Vet findById(UUID id) {

		return super.findById(id);
	}
}
