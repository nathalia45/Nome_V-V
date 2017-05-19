package nome.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String NomePessoa;
	private String TipodePessoa;
	private String getNomePessoa() {
		return NomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		NomePessoa = nomePessoa;
	}
	public String getTipodePessoa() {
		return TipodePessoa;
	}
	public void setTipodePessoa(String tipodePessoa) {
		TipodePessoa = tipodePessoa;
	}
	@Override
	public String toString() {
		return "Pessoa [NomePessoa=" + NomePessoa + ", TipodePessoa=" + TipodePessoa + "]";
	}
	
	

}
