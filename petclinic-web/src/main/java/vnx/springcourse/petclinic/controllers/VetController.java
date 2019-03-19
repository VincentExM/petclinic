package vnx.springcourse.petclinic.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class VetController {

	@RequestMapping({ "/vets", "/vets/index", "/vets/index.html" })
	public String listVets() {

		return "vets/index";
	}
}
