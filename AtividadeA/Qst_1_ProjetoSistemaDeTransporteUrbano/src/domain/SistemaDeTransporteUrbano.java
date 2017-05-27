package domain;

import java.util.*;

public class SistemaDeTransporteUrbano {
	
	private List<Empresa> empresas;
	
	public SistemaDeTransporteUrbano() {
		
		this.empresas = new ArrayList<Empresa>();
	}
	
	public void addEmpresa(Empresa empresa){
		
		this.empresas.add(empresa);
	}
	
	public void removeEmpresa(Empresa empresa){
		
		this.empresas.remove(empresa);
	}
	
	public Empresa selecioneEmpresa(int index){
		
		return empresas.get(index);
	}
}
