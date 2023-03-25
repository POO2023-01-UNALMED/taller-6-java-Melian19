package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
	private int cantidadAutosCreados = 0;
	
	//costructor
	
	public Pais(String name) {
		nombre = name;
		listaPaises.add(this);
	}
	
	//metodos get y set
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String name) {
		nombre = name;
	}
	public static ArrayList<Pais> getListaPaises(){
		return listaPaises;
	}
	public static void setListaPaises(ArrayList<Pais> newPaises) {
		listaPaises = newPaises;
	}
	public int getcantidadAutosCreados() {
		return cantidadAutosCreados;
	}
	public void setcantidadAutosCreados(int num) {
		cantidadAutosCreados = num;
	}
	
	//metodos
	
	public Pais paisMasVendedor() {
		int mayor = 0;
		Pais mejorPais = null;
		for(int i = 0; i < listaPaises.size(); i++) {
			if (listaPaises.get(i).getcantidadAutosCreados() > mayor) {
				mayor = listaPaises.get(i).getcantidadAutosCreados();
				mejorPais = this;
			}
		}
		return mejorPais;
		
	}
	
}
