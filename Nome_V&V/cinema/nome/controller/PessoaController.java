package nome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import nome.daos.PessoaDAO;
import nome.model.Pessoa;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaDAO pessoaDao;
	
	@RequestMapping("/pessoas/form")
	public String form(){
		return "Pessoa/form";
	}
	@RequestMapping("/pessoas")
	public String grava( Pessoa pessoa){
		System.out.println(pessoa);
		pessoaDao.gravar(pessoa);
		return "pessoas/ok";
	}
}
