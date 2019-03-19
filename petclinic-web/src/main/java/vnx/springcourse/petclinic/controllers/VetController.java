package vnx.springcourse.petclinic.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/vets")
@Controller
public class VetController {

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listVets() {

		return "vets/index";
	}
}
