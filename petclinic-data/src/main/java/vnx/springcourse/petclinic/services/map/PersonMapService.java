package vnx.springcourse.petclinic.services.map;

import java.util.*;

import vnx.springcourse.petclinic.model.*;
import vnx.springcourse.petclinic.services.*;

public class PersonMapService extends AbstractMapService<Person, UUID> implements CrudService<Person, UUID> {

	@Override
	public Set<Person> findAll() {

		return super.findAll();
	}

	@Override
	public void delete(Person object) {

		super.delete(object);
	}

	@Override
	public Person save(Person object) {

		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(UUID id) {

		super.deleteById(id);
	}

	@Override
	public Person findById(UUID id) {

		return super.findById(id);
	}
}
