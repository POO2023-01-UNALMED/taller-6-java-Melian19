package vehiculos;

public class Vehiculo {
	
	private String placa;
	private int puertas;
	private int VelocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos = 0;
	
	//Constructor
	
	public Vehiculo(String plc, int npuertas, int velocidad, String name, int price, int weight, String trcn, Fabricante fabrica) {
		placa = plc;
		puertas = npuertas;
		VelocidadMaxima = velocidad;
		nombre = name;
		precio = price;
		peso = weight;
		traccion = trcn;
		fabricante = fabrica;
		CantidadVehiculos ++;
		fabricante.setcantidadAutosCreados(fabricante.getcantidadAutosCreados()+1);
		fabricante.getPais().setcantidadAutosCreados(fabricante.getPais().getcantidadAutosCreados()+1);
	}
	
	//metodos get y set
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String plc) {
		placa = plc;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int numero) {
		puertas = numero;
	}
	public int getVelocidadMaxima() {
		return VelocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidad) {
		VelocidadMaxima = velocidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		nombre = name;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int price) {
		precio = price;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int numero) {
		peso = numero;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String trcn) {
		traccion = trcn;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabrica) {
		fabricante = fabrica;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int numero) {
		CantidadVehiculos = numero;
	}
	
	//metodos
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+ Automovil.getCantidadAutomoviles() + "\nCamionetas: " + Camioneta.getCantidadCamionestas() + "\nCamiones: " + Camion.getCantidadCamiones();
	}

}
