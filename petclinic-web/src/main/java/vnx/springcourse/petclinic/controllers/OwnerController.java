package vnx.springcourse.petclinic.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listVets() {

		return "owners/index";
	}
}
