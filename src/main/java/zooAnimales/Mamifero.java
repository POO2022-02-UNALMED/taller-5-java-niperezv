package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		listado.add(this);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public Mamifero(){
		listado.add(this);
		
	}
	
	//metodos_pelaje
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	//metodos_patas
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	//metodos_array
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	
	//metodo_cantidad
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	//metodos_crear
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}

}
