package com.isban.cntbr.ejercicios.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.isban.cntbr.ejercicios.model.Tarea;
import com.isban.cntbr.ejercicios.model.Usuario;

public class TareasDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Map<Integer, List<Tarea>> tareas = new HashMap<Integer, List<Tarea>>();

	public List<Tarea> getAllTareas(Integer usuario) {

		return tareas.get(usuario);

	}

	public Tarea getTareas(Integer idTarea, Integer usuario) {

		List<Tarea> listaTareas = tareas.get(usuario);

		if (listaTareas != null) {
			for (Tarea tareaUsuario : listaTareas) {

				if (tareaUsuario.getId() == idTarea) {

					return tareaUsuario;
				}
			}
		}
		return null;

	}

	public void setTareas(Tarea tarea) {

		List<Tarea> listaUsuario = getAllTareas(tarea.getIdUsuario());
		

		if (listaUsuario == null) {
			
			List<Tarea> listaTareas = new ArrayList<Tarea>();
			listaTareas.add(tarea);
			tareas.put(tarea.getIdUsuario(), listaTareas);

		} else {

			listaUsuario.add(tarea);
		}

	}
	
	public void  cortaTarea (List<Tarea> listaTareas){
		
		for (Tarea tareaUsuario : listaTareas) {
			if (tareaUsuario.getTarea().length() > 4) {			
				String detalle=	tareaUsuario.getTarea().substring(0,4)	+ "...";
				tareaUsuario.setTarea(detalle);
								
			}
			
			
		}
		
	}
	

}
