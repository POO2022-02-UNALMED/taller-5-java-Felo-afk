package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas=new ArrayList<Zona>();
	public Zoologico() {
		this(null, null);
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public int totalAnimales() {
		int animales = 0;
		for(Zona zona :zonas) {
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
		return this.zonas;
	}

	public void setZona(ArrayList zonas) {
		this.zonas = zonas;
	}
}
