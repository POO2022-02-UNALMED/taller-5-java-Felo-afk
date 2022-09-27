package gestion;
import java.util.ArrayList;
public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Arraylist<Animal> animales=new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre= nombre;
		this.zoo = zoo;

	}
	public Zona() {
		this(null, null);
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		
	}
	public void cantidadAnimales() {
		return animales.size();
	}
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return this.zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList getAnimales() {
		return this.animales;
	}

	public void setAnimales(ArrayList animales) {
		this.animales = animales;
	}
}