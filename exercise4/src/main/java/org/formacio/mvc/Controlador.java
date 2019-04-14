package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Controlador {
	
	/* ---- Properties ---- */
	@Autowired
	private ServeiAlumnat servei = null;

}
