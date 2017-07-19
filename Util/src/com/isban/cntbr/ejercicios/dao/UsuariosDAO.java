package com.isban.cntbr.ejercicios.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.isban.cntbr.ejercicios.model.Usuario;

public class UsuariosDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 
	private Map<Integer,Usuario> contactos = new HashMap<Integer, Usuario>();
		
	

	public UsuariosDAO() {
		super();
	}


	public UsuariosDAO(Map<Integer, Usuario> contactos) {
		super();
		this.contactos = contactos;
	}


	public Usuario getContacto(Integer idUsuario) {
		return contactos.get(idUsuario);
	}


	public void setContactos(Usuario contacto) {
		contactos.put(contacto.getId(), contacto);
	}
	
	public List<Usuario> getAllcontactos() {
		return new ArrayList<Usuario>(contactos.values());
	}
			


}
