package vnx.springcourse.petclinic.services;

import java.util.*;

import vnx.springcourse.petclinic.model.*;

public interface OwnerService extends CrudService<Owner, UUID> {

	Owner findByLastName(String lastName);


}
