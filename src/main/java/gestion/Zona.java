package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo.add(zoo);
	}
	public Zona(){
		
	}
	
	//metodos_nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos_zoo
	public Zoologico getZoo() {
		return zoo.get(0);
	}
	public void setZoo(Zoologico zoo) {
		this.zoo.add(zoo);
	}
	
	//metodos_array
	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	//metodos_agregar_animales
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	//metodo_cantidad_animales
	public int cantidadAnimales() {
		return animales.size();
	}
}
