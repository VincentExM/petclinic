package vnx.springcourse.petclinic.model;

import java.time.*;

import lombok.*;

@Getter
@Setter
public class Pet extends BaseEntity {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

}
