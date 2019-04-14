package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	/* ---- Properties ---- */
	@Autowired
	private ServeiAlumnat servei = null;
	
	
	/* ---- Getters ---- */
	public ServeiAlumnat getServei() {
		return servei;
	}
	
	
	/* ---- Behaviors ---- */
	@RequestMapping(value = "/alumnes")
	public int devolverNumeroAlumnes() {
		return getServei().getRepositori().getBBDD().size();
	}
}
