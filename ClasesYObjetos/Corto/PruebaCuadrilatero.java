import java.io.*;
public class PruebaCuadrilatero{
	public static void main(String args[])throws IOException{
		Cuadrilatero A = new Cuadrilatero();
		String msg = "El cuadrilatero "+A.Nombre +" es de tipo "+A.obtenerTipoCuadrilatero();
		System.out.println(msg);
		///////////////////////////////////////////
		Punto a = new Punto(0,0);
		Punto b = new Punto(0,10);
		//Linea 1
		Linea L1 = new Linea(a,b,"cyan");
		Punto c = new Punto(0,10);
		Punto d = new Punto(20,10);
		//Linea 2
		Linea L2 = new Linea(c,d,"cyan");
		Punto e = new Punto(20,10);
		Punto f = new Punto(20,0);
		//Linea 3
		Linea L3 = new Linea(e,f,"cyan");
		Punto g = new Punto(20,0);
		Punto h = new Punto(0,0);
		//Linea 4
		Linea L4 = new Linea(g,h,"cyan");
		//////////////////////////////////
		Cuadrilatero B = new Cuadrilatero("Rectangulo",L1,L2,L3,L4);
		msg = "El cuadrilatero "+B.Nombre +" es de tipo "+B.obtenerTipoCuadrilatero();
		System.out.println(msg);
		///////////////////////////////////////////
		a = new Punto(0,0);
		b = new Punto(0,20);
		//Linea 1
		L1 = new Linea(a,b,"cyan");
		c = new Punto(0,20);
		d = new Punto(20,10);
		//Linea 2
		L2 = new Linea(c,d,"cyan");
		e = new Punto(20,10);
		f = new Punto(20,0);
		//Linea 3
		L3 = new Linea(e,f,"cyan");
		g = new Punto(20,0);
		h = new Punto(0,0);
		//Linea 4
		L4 = new Linea(g,h,"cyan");
		//////////////////////////////////
		Cuadrilatero C = new Cuadrilatero("Rectangulo",L1,L2,L3,L4);
		msg = "El cuadrilatero "+C.Nombre +" es de tipo "+C.obtenerTipoCuadrilatero();
		System.out.println(msg);
	}
}
