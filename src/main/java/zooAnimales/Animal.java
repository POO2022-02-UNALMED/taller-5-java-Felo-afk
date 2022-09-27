package zooAnimales;
import gestion.*;
public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public Animal (String nombre, int edad, String habitat, Zona zona) {
		this.totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		this(nombre, edad, habitat, genero, null);
	}
	public Animal() {
		this(null,0,null,null);
		
	}
	public String moivimiento() {
		return "desplazarse";
	}
	public int totalPorTipo() {
		return ("Mamiferos: "+ Mamifero.cantidadMamiferos + "\nAves: "+ Ave.cantidadAves+ "\nRepiles: "+ Reptiles.cantidadReptiles+ "\nPeces: "+ Pez.cantidadPeces + "\nAnfibios: " + Anfibio.cantidadAnfibios);
	}
	@override
	public String toString() {
		if (this.zona != null) {
		return "Mi nombre es "+ nombre + " tengo una edad de " + edad + "habito en "+ habitat +" y mi genero es "
				genero ", la zona en la que me ubico es "+zona.getNombre +" , en el "+ zona.getZoo;
		}
		else {
            return "Mi nombre es "+nombre + ", tengo una edad de "+ edad + ", habito en " + habitat+
                    " y mi genero es " + genero ;
		}
	}
	public int getTotalAnimales() {
		return this.totalAnimales;
	}
	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return this.habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public Zona getZona() {
		return this.zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}
