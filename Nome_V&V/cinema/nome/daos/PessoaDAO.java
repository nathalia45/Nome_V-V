package nome.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nome.model.Pessoa;

@Repository
@Transactional
public class PessoaDAO {
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Pessoa pessoa){
		manager.persist(pessoa);
		
	}
	
	

}
