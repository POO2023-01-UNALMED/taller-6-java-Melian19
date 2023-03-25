package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private static int CantidadAutomoviles = 0;
	
	//constructor
	
	public Automovil(String plc, String name, int price, int weight, Fabricante fabrica, int sillas) {
		super(plc, 4, 100, name, price, weight, "FWD", fabrica);
		puestos = sillas;
		CantidadAutomoviles ++;
	}
	
	//metodo get y set
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int sillas) {
		puestos = sillas;
	}
	public static int getCantidadAutomoviles() {
		return CantidadAutomoviles;
	}
	public static void setCantidadAutomoviles(int numero) {
		CantidadAutomoviles = numero;
	}

}
