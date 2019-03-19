package vnx.springcourse.petclinic.services;

import java.util.*;

public interface CrudService<T, ID> {

	Set<T> findAll();

	T findById(ID id);

	T save(T object);

	void delete(T object);

	void deleteById(ID id);

}
