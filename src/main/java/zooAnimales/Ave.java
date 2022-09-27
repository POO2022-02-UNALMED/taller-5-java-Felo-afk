package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado=new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	public Ave() {
		this(null, 0, null, null, null);
		
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}

	public static int cantidadAves() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "Volar";
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		listado.add(halcon);		
		halcones++;

		return halcon;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
	    listado.add(aguila);
	    aguilas++;
	    return aguila;
	}
	public ArrayList getListado() {
		return this.listado;
	}
	public void setListado(ArrayList listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

}
	
