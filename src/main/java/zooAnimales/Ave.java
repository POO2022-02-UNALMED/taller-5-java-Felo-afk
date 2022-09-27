package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado=new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;

	public Ave(String nombre, int edad, String habitat, String colorPlumas) {
		super(nombre, edad, habitat);
		this.colorPlumas = colorPlumas;
	}
	public Ave() {
		this(null, 0, null, null);
		
	}
	public int cantidadAves() {
		return listado.size;
	}
	@overide
	public String movimiento() {
		return "Volar";
	}
	public Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return halcon;
	}
	public Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
	    listado.add(aguila);
	    aguilas++;
	    return aguila;
	}
	public Arraylist getListado() {
		return this.listado;
	}
	public void setListado(Arraylist listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

}
	
