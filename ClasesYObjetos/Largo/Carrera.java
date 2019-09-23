/*
 * A unos alumnos de la materia de simulacion, el profesor
 * les ha encargado programar un simulador, de carreras
 * de autos de radio control.
 * 
 * Un coche de control remoto tiene tres propiedades basicas:
 * Un Nombre, Un Tipo y una Bateria.
 * 
 * Dependiendo del Tipo del coche puede desempeñar una velocidad
 * distinta
 * 
 * Por ejemplo:
 * Si el Tipo 1 entonces la velocidad de 8 cm / segundos
 * Si el Tipo 2 entonces la velocidad de 6 cm / segundos
 * Cualquier otro entonces la velocidad de 4 cm / segundos
 * 
 * No obstante si un auto tiene mayor velocidad tambien se gasta
 * mas la bateria por lo que segun el tipo, la bateria se consume
 * de la siguiente manera:
 * 
 * Si el Tipo 1 entonces bateria se gasta 1/3 de la distancia recorrida
 * Si el Tipo 2 entonces bateria se gasta 1/4 de la distancia recorrida
 * Cualquier otro entonces bateria se gasta 1/5 de la distancia recorrida
 * 
 * Por lo que:
 * 		Tipo 1
 * 		BateriaActual = CapacidadInicialBateria - Distancia/3.0
 * 		Tipo 2
 * 		BateriaActual = CapacidadInicialBateria - Distancia/4.0
 * 		Otro
 * 		BateriaActual = CapacidadInicialBateria - Distancia/5.0
 * 
 * El simulador Debe calcular que auto de tres llega más lejos en un
 * minuto, para que la simulacion sea lo mas confiable, se evaluara
 * segundo a segundo.
 * 
 * Recordando que:
 *    Distancia = Velocidad * Tiempo;
 * 
 * Un alumno, hizo el programa y lo pego en una memoria USB
 * Desgraciadamente, esa memoria se daño por sacarla sin 
 * seguridad de la computadora
 * por lo que ahora esta incompleto, afortunadamente hay un 
 * archivo de texto de lo que deberia imprimir en pantalla el simulador
 * 
 * 
 * Reescriba aquellos metodos y atributos que se perdieron en la 
 * memoria
 * 
 * El archivo Carrera.java donde esta el main esta completo
 * El archivo AutoRadioControl.java esta dañado
 * El archivo Resultados.txt Tiene lo que deberia imprimir Carrera
 * 
 * PD.
 *  El alumno puso nombres de villanos de CN a los coches.
 */ 

import java.io.*;
public class Carrera{
	public static void main(String args[]) throws IOException{
		int Segundos = 0;
		AutoRadioControl A = new AutoRadioControl();
		AutoRadioControl B = new AutoRadioControl("Him",2,100);
		AutoRadioControl C = new AutoRadioControl(A);
		C.Nombre = "Aku";
		C.asignarTipo(3);
		
		for(;Segundos<=60;Segundos++){
			System.out.println("=================");
			System.out.println("Segundo "+Segundos );
			
			A.calcularDistancia(Segundos);
			B.calcularDistancia(Segundos);
			C.calcularDistancia(Segundos);
			System.out.println("A "+A.obtenerDistancia()+" Bateria "+A.obtenerBateria());
			System.out.println("B "+B.obtenerDistancia()+" Bateria "+B.obtenerBateria());
			System.out.println("C "+C.obtenerDistancia()+" Bateria "+C.obtenerBateria());
			System.out.println("=================");
		}
		
		System.out.println("El Auto ganador es:");
		if( (A.obtenerDistancia() > B.obtenerDistancia()) && (A.obtenerDistancia() > C.obtenerDistancia()) ){
			System.out.println(A.toString());
		}
		if( (B.obtenerDistancia() > A.obtenerDistancia()) && (B.obtenerDistancia() > C.obtenerDistancia()) ){
			System.out.println(B.toString());
		}
		if( (C.obtenerDistancia() > B.obtenerDistancia()) && (C.obtenerDistancia() > A.obtenerDistancia()) ){
			System.out.println(C.toString());
		}
		///////////////////////////////////
		System.out.println("=================");
		A.recargarBateria();
		B.recargarBateria();
		C.recargarBateria();
		System.out.println("Recargando Bateria");
		///////////////////////////////////
		System.out.println(A.toString());
		System.out.println(B.toString());
		System.out.println(C.toString());
	}
}
