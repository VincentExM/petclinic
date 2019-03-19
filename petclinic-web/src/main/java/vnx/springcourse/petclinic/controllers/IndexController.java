package vnx.springcourse.petclinic.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

	@RequestMapping({ "", "/", "index", "index.html" })
	public String index() {

		return "index";
	}

}
