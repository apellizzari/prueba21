package com.tipsai.curso.holamundo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tipsai.curso.holamundo.model.Mensaje;

public class HolaMundo extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String mensaje;
	
	public String execute() throws Exception{
		//mensaje = getMensaje();
		System.out.print("HolaMundo");
		return SUCCESS;
	} 	

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}

