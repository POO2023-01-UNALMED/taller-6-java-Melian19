package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	private static int CantidadCamiones = 0;
	
	//constructor
	
	public Camion(String plc, String name, int price, int weight, Fabricante fabrica, int eje) {
		super(plc, 2, 80, name, price, weight, "4X2", fabrica);
		ejes = eje;
		CantidadCamiones ++;
	}
	
	//metodo get y set
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int num) {
		ejes = num;
	}
	public static int getCantidadCamiones() {
		return CantidadCamiones;
	}
	public static void setCantidadCamiones(int numero) {
		CantidadCamiones = numero;
	}
	
}
