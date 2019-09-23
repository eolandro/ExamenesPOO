public class AutoRadioControl{
	public String Nombre;
	private int Tipo;
	private double CapBateria;
	/////////////////////////////////////////
	private double Velocidad;
	private double Bateria;
	private double Distancia;
	/////////////////////////////////////////
	public AutoRadioControl(){
		Tipo = 1;
		Nombre = "Black Hat";
		CapBateria = 100;
		
		Bateria = CapBateria;
		Velocidad = 8;
	}
	public AutoRadioControl(String Nom, int Tip, double CB){
		Tipo = Tip;
		Nombre = Nom;
		CapBateria = CB;
		
		Bateria = CapBateria;
		
		switch(Tip){
			case 1:
				Velocidad = 8;
			break;
			case 2:
				Velocidad = 6;
			break;
			default:
				Velocidad = 4;
		}
	}
	public AutoRadioControl(AutoRadioControl Auto){
		Tipo = Auto.obtenerTipo();
		Nombre = Auto.Nombre;
		CapBateria = Auto.obtenerCapBateria();
		
		Bateria = CapBateria;
		switch(Tipo){
			case 1:
				Velocidad = 8;
			break;
			case 2:
				Velocidad = 6;
			break;
			default:
				Velocidad = 4;
		}
		
		
	}
	/////////////////////////////////////////
	public void asignarTipo(int Tip){
		Tipo = Tip;
		switch(Tipo){
			case 1:
				Velocidad = 8;
			break;
			case 2:
				Velocidad = 6;
			break;
			default:
				Velocidad = 4;
		}
	}
	
	public int obtenerTipo(){
		return Tipo;
	}
	
	public void asignarCapBateria(double CB){
		CapBateria = CB;
	}
	
	public double obtenerCapBateria(){
		return CapBateria;
	}
	////////////////////////////////
	
	public double obtenerVelocidad(){
		return Velocidad;
	}
	
	public double obtenerBateria(){
		return Bateria;
	}
	
	public double obtenerDistancia(){
		return Distancia;
	}
	
	public void calcularDistancia(int Tiempo){
		double BateriaCon = 0.0;
		if (Bateria > 0){
			Distancia = Velocidad * Tiempo;
			switch(Tipo){
				case 1:
					BateriaCon = Distancia * (1/3.0);
				break;
				case 2:
					BateriaCon = Distancia * (1/4.0);
				break;
				default:
					BateriaCon = Distancia * (1/5.0);
			}
			if (BateriaCon < CapBateria){
				Bateria = CapBateria - BateriaCon;
			}else{
				Bateria = 0;
			}
		}
		
	}
	//////////////////////////////////////
	public void recargarBateria(){
		Bateria = CapBateria;
	}
	//////////////////////////////////////////
	public String toString(){
		return Nombre + " de tipo "+Tipo+" con bateria de "+Bateria;
	}
	
}
