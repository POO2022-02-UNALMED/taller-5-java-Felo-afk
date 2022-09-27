package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado=new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public Anfibio() {
		this(null, 0, null, null, null, false);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel= colorPiel;
		this.venenoso= venenoso;
	}

	public static int cantidadAnfibios() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero)  {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(rana);
		ranas++;
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero)  {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		listado.add(salamandra);
		salamandras++;
		return salamandra;
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVeneoso() {
		return this.venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public ArrayList getListado() {
		return this.listado;
	}
	public void setListado(ArrayList listado) {
		this.listado = listado;
	}
} 
