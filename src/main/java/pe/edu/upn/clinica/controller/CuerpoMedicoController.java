package pe.edu.upn.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medico")

public class CuerpoMedicoController {
	
	@GetMapping
	public String inicio() {
		return "index";
	}

}
