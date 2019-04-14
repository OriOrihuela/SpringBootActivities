package org.formacio.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServeiAlumnat {
	
	/* ---- Properties ---- */
	@Autowired
	private RepositoriAlumnesMemoria repositori;
	
	
	/* ---- Getters ----*/
	public RepositoriAlumnesMemoria getRepositori() {
		return this.repositori;
	}

	
	/* ---- Behaviours ---- */
	@PostConstruct
	public void initializer() {
		getRepositori().altaAlumne(1, "Antonia");
		getRepositori().altaAlumne(2, "Joan");
	}
	
	public boolean matricula (int id, String alumne) {
		if (alumne != null) {
			repositori.altaAlumne(id, alumne);
			return true;
		}
		return false;
	}
}
