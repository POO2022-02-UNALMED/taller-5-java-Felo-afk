package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas=new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
		this(null, null);
	}
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public void totalAnimales() {
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

	public static void setZona(ArrayList zonas) {
		Zoologico.zonas = zonas;
	}
}
