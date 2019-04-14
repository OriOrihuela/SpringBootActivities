package org.formacio.component;

import org.springframework.stereotype.Component;

@Component
public class ServeiConsultaEmpreses {

	// aquest servei necessita d'un integrador de cotitzacions per retornar la informacio
	// declarau la dependencia i feis que spring la resolgui
	
	
	// modifiqueu aquest metode per canviar el 0 per el valor obtingut del clientCotitzacionsWS
	public String infoEmpresa(String empresa) {
		switch (empresa) {
	     case "cervesses.sa": return "La empresa " + empresa + " cotitza a 30.0";
	     case "shandies.sa": return "La empresa " + empresa + " cotitza a 10.0";
	     default : return "La empresa " + empresa + " cotitza a 0";
		}
	}

	
	// modifiqueu aquest metode per canviar el 0 per el valor obtingut del clientCotitzacionsWS
	// aquest es, segurament, l'exercici mes xungo !
	// com farieu per fer que el metode infoDiari de obteMitjanaDiariaCotitzacions nomes se crides una vegada?
	// pista (si nomes s'ha de cridar una vegada ... haurem de guardar el resultat a alguna banda ... )
	public String infoDiari() {
		return "La cotitzacio mitjana diaria es 0";
	}
}