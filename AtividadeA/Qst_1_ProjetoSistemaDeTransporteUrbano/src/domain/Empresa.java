package domain;

import java.util.*;

public class Empresa {
	
	private String nomeEmpresa;
	private String cnpj;
	private List<Linha> linhas;
	private List<Onibus> onibus;
	private List<Funcionario> funcionariosEmpresa;
	
	public Empresa(String nomeEmpresa, String cnpj) {
		
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = nomeEmpresa;
		this.linhas = new ArrayList<Linha>();
		this.funcionariosEmpresa = new ArrayList<Funcionario>();
		this.onibus = new ArrayList<Onibus>();
	}
	
	public String getNomeEmpresa() {
		
		return nomeEmpresa;
	}
	
	public String getCnpj() {
		
		return cnpj;
	}
	
	public void addLinha(Linha linha){
		
		this.linhas.add(linha);
	}
	
	public void removeLinha(Linha linha){
		
		this.linhas.remove(linha);
	}
	
	public void addOnibus(Onibus onibus){
		
		this.onibus.add(onibus);
	}
	
	public void removeOnibus(Onibus onibus){
		
		this.onibus.remove(onibus);
	}
	
	public void addFuncionario(Funcionario funcionario){
		
		this.funcionariosEmpresa.add(funcionario);
	}
	
	public void removeFuncionario(Funcionario funcionario){
		
		this.funcionariosEmpresa.remove(funcionario);
	}
}
