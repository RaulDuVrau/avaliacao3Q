package br.com.etechoracio.avaliacao.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.etechoracio.avaliacao.model.Instrumento;

public class InstrumentoMB {

	@Autowired
	private InstrumentoSB instrumentoSB;

	private List<Instrumento> registros;

	protected void postConstruct() {
		registros = InstrumentoSB.findAll();
	}

	private Instrumento edit = new Instrumento();



	public void onUpdate(Instrumento instrumento) {
		edit = instrumento;
	}

	public void onSave() {
		try {
			InstrumentoSB.save(edit);
			showInsertMessage();

		} catch (Exception e) {
			showErrorMessage(e.getMessage());
		}

	}

}