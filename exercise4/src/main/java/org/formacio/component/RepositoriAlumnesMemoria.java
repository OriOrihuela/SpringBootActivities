package org.formacio.component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoriAlumnesMemoria implements RepositoriAlumnes {
	
	/* ---- Properties ---- */
	private Map<Integer, String> bbdd = new HashMap<>();
	
	
	/* ---- Getters ---- */
	public Map<Integer, String> getBBDD() {
		return this.bbdd;
	}
	
	
	/* ---- Behaviours ---- */
	@Override
	public String obteAlumne(int id) {
		return getBBDD().get(id);
	}

	@Override
	public void altaAlumne(int id, String nom) {
		getBBDD().putIfAbsent(id,  nom);
	}

	@Override
	public Collection<String> llistaAlumnes() {
		return getBBDD().values();
	}

}
