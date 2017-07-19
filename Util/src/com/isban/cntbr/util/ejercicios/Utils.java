package com.isban.cntbr.util.ejercicios;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Utils {

	public static String calculoPrioridad(String prioridad) {
		String p[] = { " ", "Alta", "Baja", "Media" };
		if ("A".equals(prioridad)) {

			return p[1];

		} else if ("B".equals(prioridad)) {
			return p[2];

		} else if ("M".equals(prioridad)) {
			return p[3];
		} else {

			return p[0];

		}

		// switch (prioridad) {
		// case "":
		// System.out.println("vacio" + p[0]);
		// break;
		// case "A":
		// System.out.println(p[1]);
		// break;
		// case "B":
		// System.out.println(p[2]);
		// break;
		// case "M":
		// System.out.println(p[3]);
		// break;
		// default:
		// System.out.println("Error");
		// }
	}

	public static String validezTelefono(String telefono, String Tipo) {

		switch (Tipo) {
		case "Movil":

			if (("6".equals(telefono.substring(0, 1)) || "7".equals(telefono
					.substring(0, 1))) && (9 == telefono.length())) {
				String validez = "OK";
				return validez;

			} else {
				String valido = "No valido";
				return valido;
			}

		case "Fijo":

			if (("8".equals(telefono.substring(0, 1)) || "9".equals(telefono
					.substring(0, 1))) && 9 == telefono.length()) {

				if ("80".equals(telefono.substring(0, 2))) {
					String numero = telefono.substring(2, 3);
					switch (telefono.substring(2, 3)) {
					case "0":
						String valido = "OK";
						return valido;
					default:
						String Nvalido = "No valido";
						return Nvalido;

					}

				}
			}

			else {
				String Nvalidez = "No valido";
				return Nvalidez;
			}
			break;

		default:
			String Nvalidez = "No valido";
			return Nvalidez;
		}
		String Nvalidez = "No valido";
		return Nvalidez;

	}

	public static void main(String[] args) {

	}

	public static String[] cuadrados(String[] numeros) {

		String[] cuadrados = new String[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			Double d = Double.parseDouble(numeros[i]);
			cuadrados[i] = Math.pow(d, 2.0) + "";

		}
		return cuadrados;
	}

	public static Date calculaFecha(int dias) {
	 Date today = new Date();
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(today); 
      calendar.add(Calendar.DAY_OF_YEAR, dias);  
      return calendar.getTime();

	}
	

		
		
	}
//	public static String[] primos(Integer numero) {
//		for (int i = numero; i <= 0; i=i-1) {
//			%
			
//			primos[i] = Math.pow(d, 2.0) + "";

//		}

//	}


