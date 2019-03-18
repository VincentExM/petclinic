package vnx.springcourse.petclinic.services;

import java.util.*;

import vnx.springcourse.petclinic.model.*;

public interface PersonService {

	Person findById(UUID id);

	Person save(Owner owner);

	Person findByLastName(String lastName);

	Set<Person> findAll();

}
