public class Linea{
	private Punto Inicio;
	private Punto Fin;
	public String Color;
	// Constructor por defecto
	public Linea(){
		Inicio = new Punto(1,1);
		Fin = new Punto(-1,-1);
		Color = "cyan";
	}
	// Constructor Completo
	public Linea(Punto pInicio,Punto pFin,String lColor){
		Inicio = pInicio;
		Fin = pFin;
		Color = lColor;
	}
	// Constructor Copia
	public Linea(Linea L2){
		Inicio = L2.obtenerInicio();
		Fin = L2.obtenerFin();
		Color = L2.Color;
	}
	// Metodo de la pendiente
	public double pendiente(){
		double res = 0;
		res = Inicio.pendiente(Fin);
		return res;
		// return Inicio.pendiente(Fin);
	}
	//Metodo de distacia linea
	public double distanciaLinea(){
		return Inicio.distancia(Fin);
	}
	// Metodo tipo set
	public void colocarInicio(Punto CI){
		Inicio = CI;
	}
	// Metodo tipo get
	public Punto obtenerInicio(){
		return Inicio;
	}
	// Metodo tipo set
	public void colocarFin(Punto CF){
		Fin = CF;
	}
	// Metodo tipo get
	public Punto obtenerFin(){
		return Fin;
	}
	public String toString(){
		String tmp = "";
		tmp = "La linea de color "+Color+" que va del punto "+Inicio.toString()+ " al punto "+Fin.toString();
		return tmp;
		/*
		tmp = "La linea de color "+Color;
		tmp = tmp + " que va del punto "+Inicio.toString();
		tmp = tmp + " al punto "+Fin.toString();
		return tmp;
		*/
		
		//return "La linea de color "+Color+" que va del punto "+Inicio.toString()+ " al punto "+Fin.toString();
	}
	
	
}
