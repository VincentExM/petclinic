package vnx.springcourse.petclinic.services;

import java.util.*;

import vnx.springcourse.petclinic.model.*;

public interface VetService extends CrudService<Vet, UUID> {

	Vet findByLastName(String lastName);

}
