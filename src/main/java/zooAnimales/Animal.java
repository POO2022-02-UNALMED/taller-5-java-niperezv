package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Animal {
	private int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	public Animal(String nombre, int edad, String habitat, String genero){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal(){
		totalAnimales++;
	}
	
	//metodos_totalAnimales
	public int getTotalAnimales() {
		return totalAnimales;
	}
	public void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	
	//metodos_nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos_edad
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//metodos_habitat
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	//metodos_genero
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//metodos_array
	public ArrayList<Zona> getZona() {
		return zona;
	}
	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	
	//metodo_movimiento
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + 
				"\nAves: " +  Ave.cantidadAves() +
				"\nReptiles: " + Reptil.cantidadReptiles() + 
				"\nPeces: "+ Pez.cantidadPeces() + 
				"\nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	
	@Override
	public String toString() {
		if(zona.isEmpty()) {
			return "Mi nombre es "+nombre+", tengo una edad de "
					+edad+", habito en "+habitat+" y mi genero es "+genero;
		}
		else {
			return "Mi nombre es "+nombre+", tengo una edad de "
					+edad+", habito en "+habitat+" y mi genero es "+genero+", "
					+"la zona en la que me ubico es "+zona.get(0).getNombre()
					+", en el "+zona.get(0).getZoo().getNombre();
			}
		}
}
