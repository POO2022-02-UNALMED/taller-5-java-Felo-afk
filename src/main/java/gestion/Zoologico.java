package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zona=new ArrayList<Zona>();;
	public Zoologico() {
		this(null, null);
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public void agregarZonas(Zona z) {
		zona.add(z);
	}
	public int cantidadTotalAnimales() {
		int animales = 0;
		for(Zona zona :zona) {
			animales += zona.cantidadAnimales();
		}
		return animales;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList getZona() {
		return this.zona;
	}

	public void setZona(ArrayList zona) {
		this.zona = zona;
	}
}
