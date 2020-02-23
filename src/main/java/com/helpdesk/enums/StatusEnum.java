package com.helpdesk.enums;

public enum StatusEnum {
	
	NOVO,
	DESIGNADO,
	RESOLVIDO,
	APROVADO,
	REPROVADO,
	FECHADO;
	
	public StatusEnum getStatus(String status) {
		switch(status) {
		case "NOVO" : return NOVO;
		case "DESIGNADO" : return DESIGNADO;
		case "RESOLVIDO" : return RESOLVIDO;
		case "APROVADO" : return APROVADO;
		case "REPROVADO" : return REPROVADO;
		case "FECHADO" : return FECHADO;
		default : return NOVO;
		
		}
	}
}
