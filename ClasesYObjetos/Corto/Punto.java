public class Punto{
	private int X;
	
	private int Y;
	//Constructor defecto
	public Punto(){
		X=0;
		Y=0;
	}
	// Constructor completo
	public Punto(int CX, int CY){
		X = CX;
		Y = CY;
	}
	// Constructor copia
	public Punto(Punto p2){
		X = p2.obtenerX();
		Y = p2.obtenerY();
	}
	public int obtenerX(){
		return X;
	}
	public void colocarX(int CX){
		X = CX;
	}
	public int obtenerY(){
		return Y;
	}
	public void colocarY(int CY){
		Y = CY;
	}
	public double pendiente(Punto p2){
		int X2 = p2.obtenerX();
		int Y2 = p2.obtenerY();
		double m = 0;
		m = (double)(Y2 - Y) / (double)(X2 - X);
		return m;
	}
	public String toString(){
		String cadena = "";
		cadena = X +" , "+ Y;
		return cadena;
	}
	public double distancia(Punto p2){
		int X2 = p2.obtenerX();
		int Y2 = p2.obtenerY();
		double resultado = 0.0;
		double cuadrados = Math.pow((X2-X),2) + Math.pow((Y2-Y),2);
		resultado = Math.sqrt( cuadrados );
		return resultado;
	}
}
