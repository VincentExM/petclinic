package vnx.springcourse.petclinic.model;

import java.io.*;
import java.util.*;

import lombok.*;

@Getter
@Setter
public abstract class BaseEntity implements Serializable {

	private UUID id;

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BaseEntity that = (BaseEntity) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id);
	}
}
