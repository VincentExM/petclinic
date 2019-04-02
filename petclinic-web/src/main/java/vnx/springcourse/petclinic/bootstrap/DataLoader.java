package vnx.springcourse.petclinic.bootstrap;

import java.util.*;

import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import vnx.springcourse.petclinic.model.*;
import vnx.springcourse.petclinic.services.*;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetService petService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {

		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petService = petService;
	}

	@Override
	public void run(String... args) {

		Owner owner1 = new Owner();
		owner1.setId(UUID.randomUUID());
		owner1.setFirstName("John");
		owner1.setLastName("Snow");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(UUID.randomUUID());
		owner2.setFirstName("Fiona");
		owner2.setLastName("Green");

		ownerService.save(owner2);

		log.info("Loaded owners....");

		Vet vet1 = new Vet();
		vet1.setId(UUID.randomUUID());
		vet1.setFirstName("Butch");
		vet1.setLastName("Errr");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(UUID.randomUUID());
		vet2.setFirstName("Dr.");
		vet2.setLastName("Doolittle");

		vetService.save(vet2);

		log.info("Loaded vets.....");
	}
}
