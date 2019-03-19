package vnx.springcourse.petclinic.services.map;

import java.util.*;

import vnx.springcourse.petclinic.model.*;
import vnx.springcourse.petclinic.services.*;

public class OwnerMapService extends AbstractMapService<Owner, UUID> implements CrudService<Owner, UUID> {

	@Override
	public Set<Owner> findAll() {

		return super.findAll();
	}

	@Override
	public void delete(Owner object) {

		super.delete(object);
	}

	@Override
	public Owner save(Owner object) {

		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(UUID id) {

		super.deleteById(id);
	}

	@Override
	public Owner findById(UUID id) {

		return super.findById(id);
	}
}
