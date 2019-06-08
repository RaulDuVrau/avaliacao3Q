package br.com.etechoracio.avaliacao.bussiness;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import br.com.etechoracio.avaliacao.dao.InstrumentoDAO;

@Service
public class InstrumentoSB extends BaseSB{


	private InstrumentoDAO InstrumentoDAO;
	
	
	@Override
	protected void postConstructImpl() {
		InstrumentoDAO = getDAO(InstrumentoDAO.class);

}
	
	

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Instrumento> findAll() {
		return InstrumentoDAO.findAll();
}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Instrumento instrumento) throws Exception {
		
			InstrumentoDAO.save(instrumento);
		}
}
