package zooAnimales;
import gestion.*;
public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public Animal() {
		this(null,0,null,null);
		
	}
	public Animal (String nombre, int edad, String habitat, String genero) {
		this.totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
	}

	public String moivimiento() {
		return "desplazarse";
	}
	public int totalPorTipo() {
		return "Mamiferos: " + Mamifero.listado.size() + "\n" + "Aves: " + Ave.listado.size() + "\n" +
    			"Reptiles: " + Reptil.listado.size()+ "\n" + "Peces: " + Pez.listado.size() + "\n" +
    			"Anfibios: " + Anfibio.listado.size();
	}
	public String toString() {
		if (this.zona != null) {
            return "Mi nombre es "+getNombre()+ ", tengo una edad de "+getEdad()+ ", habito en " +getHabitat()+
                    " y mi genero es " +getGenero()+", la zona en la que me ubico es "+zona.getNombre()+
                    ", en el "+zona.getZoo().getNombre();
		}
		else {
            return "Mi nombre es "+ getNombre()+", tengo una edad de "+getEdad()+
                    ", habito en " +getHabitat()+" y mi genero es " +getGenero();
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
	public String getGenero() {
		return this.genero;
	}
	public void setGenero(String genero) {
		this.genero= genero;
	}
	public Zona getZona() {
		return this.zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}
