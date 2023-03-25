package vehiculos;

public class Camioneta extends Vehiculo {
	
	private boolean volco;
	private static int CantidadCamionestas = 0;
	
	//constructor
	
	public Camioneta(String plc, int npuertas, String name, int price, int weight, Fabricante fabrica,boolean vlc) {
		super(plc, npuertas, 90, name, price, weight, "4X4", fabrica);
		volco = vlc;
		CantidadCamionestas ++;
	}
	
	//metodo get y set
	
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean vlc) {
		volco = vlc;
	}
	public static int getCantidadCamionestas() {
		return CantidadCamionestas;
	}
	public static void setCantidadCamionestas(int numero) {
	}

}
