package vnx.springcourse.petclinic.services;

import java.util.*;

import vnx.springcourse.petclinic.model.*;

public interface PersonService extends CrudService<Person, UUID> {

	Person findByLastName(String lastName);


}
