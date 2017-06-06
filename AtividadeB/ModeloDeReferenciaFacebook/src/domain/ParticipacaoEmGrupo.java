package domain;

import java.util.Calendar;

public class ParticipacaoEmGrupo {
	
	private boolean isAdministrator;
	private Grupo grupo;
	private Calendar dataDeEntrada;
	
	public ParticipacaoEmGrupo(Grupo grupo, Calendar dataDeEntrada) {
		
		this.setAdministrator(false);
		this.grupo = grupo;
		this.dataDeEntrada = dataDeEntrada;
	}
	
	public Grupo getGrupo() {
		
		return grupo;
	}
	
	public Calendar getDataDeEntrada() {
		
		return dataDeEntrada;
	}

	public boolean isAdministrator() {
		
		return isAdministrator;
	}

	public void setAdministrator(boolean isAdministrator) {
		
		this.isAdministrator = isAdministrator;
	}
	
	
}
