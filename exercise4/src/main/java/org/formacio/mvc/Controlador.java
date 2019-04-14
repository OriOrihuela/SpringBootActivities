package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	/* ---- Properties ---- */
	@Autowired
	private ServeiAlumnat servei = null;
	
	
	/* ---- Constructor ---- */
	public Controlador (ServeiAlumnat servei) {
		this.servei = servei;
	}
	
	
	/* ---- Getters ---- */
	public ServeiAlumnat getServei() {
		return servei;
	}
	
	
	/* ---- Behaviours ---- */
	@RequestMapping(value = "/alumnes", method = RequestMethod.GET)
	public int devolverNumeroAlumnes() {
		return getServei().getRepositori().getBBDD().size();
	}
}
