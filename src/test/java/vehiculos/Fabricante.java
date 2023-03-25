package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
	private int cantidadAutosCreados = 0;
	
	//constructor
	
	public Fabricante(String name, Pais lugar) {
		nombre = name;
		pais = lugar;
		listado.add(this);
	}
	
	//metodos get y set
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		nombre = name;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais lugar) {
		pais = lugar;
	}
	public static ArrayList<Fabricante> getListado(){
		return listado;
	}
	public static void setListado(ArrayList<Fabricante> newPaises) {
		listado = newPaises;
	}
	public int getcantidadAutosCreados() {
		return cantidadAutosCreados;
	}
	public void setcantidadAutosCreados(int num) {
		cantidadAutosCreados = num;
	}
	
	//metodos
	
	public static Fabricante fabricaMayorVentas() {
		int mayor = 0;
		Fabricante mejorFabrica = null;
		for(int i = 0; i < listado.size(); i++) {
			if (listado.get(i).getcantidadAutosCreados() > mayor) {
				mayor = listado.get(i).getcantidadAutosCreados();
				mejorFabrica = listado.get(i);
			} else {
				continue;
			}
		}
		return mejorFabrica;
	}

}
