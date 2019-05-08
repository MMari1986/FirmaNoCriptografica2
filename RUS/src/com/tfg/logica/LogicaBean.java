package com.tfg.logica;


import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("logicaBean")
@SessionScoped
public class LogicaBean implements Serializable {

	private static final long serialVersionUID = -575620218868403586L;

	//Contiene la accion que está realizando el usuario
	private String operacion = "";

	public LogicaBean() {
		super();
	}

	
	
	
	
	
	
	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}


}
