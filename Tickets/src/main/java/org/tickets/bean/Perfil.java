package org.tickets.bean;
// default package
// Generated 22-feb-2016 14:08:11 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil implements java.io.Serializable {

	private Byte codigo;
	private String perfil;
	private Set empleados = new HashSet(0);

	public Perfil() {
	}

	public Perfil(String perfil) {
		this.perfil = perfil;
	}

	public Perfil(String perfil, Set empleados) {
		this.perfil = perfil;
		this.empleados = empleados;
	}

	public Byte getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Byte codigo) {
		this.codigo = codigo;
	}

	public String getPerfil() {
		return this.perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Set getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Set empleados) {
		this.empleados = empleados;
	}

}
