public class Cuadrilatero{
	public String Nombre;
	private Linea L1;
	private Linea L2;
	private Linea L3;
	private Linea L4;
	public Cuadrilatero(){
		Nombre = "Cuadrado ejemplo";
		Punto a = new Punto(0,0);
		Punto b = new Punto(0,1);
		//Linea 1
		L1 = new Linea(a,b,"cyan");
		Punto c = new Punto(0,1);
		Punto d = new Punto(1,1);
		//Linea 2
		L2 = new Linea(c,d,"cyan");
		Punto e = new Punto(1,1);
		Punto f = new Punto(1,0);
		//Linea 3
		L3 = new Linea(e,f,"cyan");
		Punto g = new Punto(1,0);
		Punto h = new Punto(0,0);
		//Linea 4
		L4 = new Linea(g,h,"cyan");
	}
	public Cuadrilatero(String Nombre,Linea L1,Linea L2, Linea L3, Linea L4 ){
		this.Nombre = Nombre;
		this.L1 = L1;
		this.L2 = L2;
		this.L3 = L3;
		this.L4 = L4;
	}
	public Cuadrilatero(Cuadrilatero C){
		this.Nombre = C.Nombre;
		this.L1 = C.obtenerLinea1();
		this.L2 = C.obtenerLinea2();
		this.L3 = C.obtenerLinea3();
		this.L4 = C.obtenerLinea4();
	}
	public int obtenerTipoCuadrilatero(){
		int tipo = 0;
		double d1,d2,d3,d4;
		d1 = L1.distanciaLinea();
		d2 = L2.distanciaLinea();
		d3 = L3.distanciaLinea();
		d4 = L4.distanciaLinea();
		tipo = 3;
		if ((d1 == d2) && (d2 == d3) && (d3 == d4)){
			tipo = 1;
		}
		if ((d1 == d3) && (d2 == d4) && (d1 != d2) ){
			tipo = 2;
		}
		return tipo;
	}
	public void asignarLinea1(Linea L){
		L1 = L;
	}
	public Linea obtenerLinea1(){
		return L1;
	}
	public void asignarLinea2(Linea L){
		L2 = L;
	}
	public Linea obtenerLinea2(){
		return L2;
	}
	public void asignarLinea3(Linea L){
		L3 = L;
	}
	public Linea obtenerLinea3(){
		return L3;
	}
	public void asignarLinea4(Linea L){
		L4 = L;
	}
	public Linea obtenerLinea4(){
		return L4;
	}
}
