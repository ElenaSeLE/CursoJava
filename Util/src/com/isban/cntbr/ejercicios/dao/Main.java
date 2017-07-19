package com.isban.cntbr.ejercicios.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.isban.cntbr.ejercicios.model.Tarea;
import com.isban.cntbr.ejercicios.model.Usuario;
import com.isban.cntbr.ejercicios.dao.UsuariosDAO;
import com.isban.cntbr.ejercicios.dao.TareasDAO;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		// Creamos Tareas
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-YYYY");

		//Creamos un usuario
		Usuario U1= new Usuario(11, "PEPE", "123P");
		Usuario U2= new Usuario(22, "PePa", "1P3P");
		Usuario U3= new Usuario(33, "PiPA", "12PP");
		
		Tarea T1 = new Tarea (1, 11, "tarea1!!!!!!!!!!!!!!!", formatoDelTexto.parse("20-10-2000") , formatoDelTexto.parse("26-10-2000"), "A", true);
		Tarea T2 = new Tarea (2, U1.getId(), "tarea2!!!!!!!!!!!!!!!", formatoDelTexto.parse("20-10-2000"), formatoDelTexto.parse("26-10-2000"), "A", true);
		Tarea T3 = new Tarea (3, 11, "tarea3!!!!!!!!!!!!!!!", formatoDelTexto.parse("20-10-2000"), formatoDelTexto.parse("26-10-2000"), "A", true);
		Tarea T4 = new Tarea(4, 11, "tarea4!!!!!!!!!!!!!!!",formatoDelTexto.parse("20-10-2000"), formatoDelTexto.parse("26-10-2000"), "A", true);
		Tarea T5 = new Tarea(11, 22, "tarea11!!!!!!!!!!!!!!!", formatoDelTexto.parse("20-10-2000"), formatoDelTexto.parse("26-10-2000"), "A", true);
		Tarea T6 = new Tarea(12, 22, "tarea12!!!!!!!!!!!!!!!", formatoDelTexto.parse("20-10-2000"), formatoDelTexto.parse("26-10-2000"), "A", true);
		Tarea T7 = new Tarea();
		
		
		List<Tarea> listaTareas = new ArrayList<Tarea>();
		TareasDAO introduceTarea = new TareasDAO();
		introduceTarea.setTareas(T1);
		introduceTarea.setTareas(T2);
		introduceTarea.setTareas(T3);
		introduceTarea.setTareas(T4);
		introduceTarea.setTareas(T5);
		introduceTarea.setTareas(T6);
	//	introduceTarea.setTareas(T7);
		
		Tarea tarea1= introduceTarea.getTareas(3, 11);
		
		UsuariosDAO ayudaUsuario = new UsuariosDAO();
		ayudaUsuario.setContactos(U1);
		ayudaUsuario.setContactos(U2);
		ayudaUsuario.setContactos(U3);
		
		ayudaUsuario.getContacto(tarea1.getIdUsuario()).getNombre();
				
				
		
		introduceTarea.getAllTareas(22);
		
		
		introduceTarea.cortaTarea(introduceTarea.getAllTareas(22));
		
		
		introduceTarea.getAllTareas(22);
		
	}



}
