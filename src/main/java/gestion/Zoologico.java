package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico() {
		
	}
	
	//metodo_cantidad_total
	public int cantidadTotalAnimales() {
		int cant = 0;
		for(Zona zona:zonas) {
			cant+=zona.cantidadAnimales();
		}
		return cant;
	}
	
	//metodos_nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos_ubicacion
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	//metodos_array
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas= zonas;
	}
	
	//metodo_agregar_zona
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
}
