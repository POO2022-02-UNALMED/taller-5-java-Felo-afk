package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
	private ArrayList<Anfibio> listado=new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel= colorPiel;
		this.venenoso= venenoso;
	}
	public Anfibio() {
		this(null, 0, null, null, null, false);
	}
	public void cantidadAnfibios() {
		return listado.size();
	}
	@override
	public String movimiento() {
		return "saltar";
	}
	public Anfibio crearRana(nombre, edad, genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(Rana);
		ranas++;
		return rana;
	}
	public void crearSalamandra(nombre, edad, genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		listado.add(salamandra);
		salamandras++;
		return salmandra;
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
