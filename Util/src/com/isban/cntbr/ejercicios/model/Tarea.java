package com.isban.cntbr.ejercicios.model;

import java.util.Date;

public class Tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Integer id;
	private Integer idUsuario;
	private String tarea;
	private Date fechaCreacion;
	private Date fechaLimite;
	private String prioridad;
	private Boolean terminada;
	
	
	
	public Tarea() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tarea(int id, int idUsuario, String tarea, Date fechaCreacion,
			Date fechaLimite, String prioridad, Boolean terminada) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.tarea = tarea;
		this.fechaCreacion = fechaCreacion;
		this.fechaLimite = fechaLimite;
		this.prioridad = prioridad;
		this.terminada = terminada;
	}
	@Override
	public String toString() {
		return "Tarea [id=" + id + ", idUsuario=" + idUsuario + ", tarea="
				+ tarea + ", fechaCreacion=" + fechaCreacion + ", fechaLimite="
				+ fechaLimite + ", prioridad=" + prioridad + ", terminada="
				+ terminada + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result
				+ ((fechaLimite == null) ? 0 : fechaLimite.hashCode());
		result = prime * result + id;
		result = prime * result + idUsuario;
		result = prime * result
				+ ((prioridad == null) ? 0 : prioridad.hashCode());
		result = prime * result + ((tarea == null) ? 0 : tarea.hashCode());
		result = prime * result
				+ ((terminada == null) ? 0 : terminada.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarea other = (Tarea) obj;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (fechaLimite == null) {
			if (other.fechaLimite != null)
				return false;
		} else if (!fechaLimite.equals(other.fechaLimite))
			return false;
		if (id != other.id)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (prioridad == null) {
			if (other.prioridad != null)
				return false;
		} else if (!prioridad.equals(other.prioridad))
			return false;
		if (tarea == null) {
			if (other.tarea != null)
				return false;
		} else if (!tarea.equals(other.tarea))
			return false;
		if (terminada == null) {
			if (other.terminada != null)
				return false;
		} else if (!terminada.equals(other.terminada))
			return false;
		return true;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getTarea() {
		return tarea;
	}
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	public Boolean getTerminada() {
		return terminada;
	}
	public void setTerminada(Boolean terminada) {
		this.terminada = terminada;
	}
	

}
