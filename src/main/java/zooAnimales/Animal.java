package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zoologico[] zoo;
	
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}

	public Animal() {
		super();
	}


	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo(){
		String str = "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + "Aves: " + Ave.cantidadAves() + "\n" 
				+ "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces() + "\n"
				+ "Anfibios: " + Anfibio.cantidadAnfibios();
		return str;
	}
	
	public String toString() {
	String str = "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en "
			+ this.habitat + " y mi genero es " + this.genero;
	return str;
	}


	public static int getTotalAnimales() {
		return totalAnimales;
	}


	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Zoologico[] getZoo() {
		return zoo;
	}


	public void setZoo(Zoologico[] zoo) {
		this.zoo = zoo;
	}
	
	
}