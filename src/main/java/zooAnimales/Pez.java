package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal {
	private static ArrayList<Pez> listado=new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez() {}
	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public static int cantidadPeces() {
		return listado.size();
		
	}
	@Override
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre, int edad, String genero)  {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return salmon;
		
	}
	public static Pez crearBacalao(String nombre, int edad, String genero)  {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return bacalao;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public ArrayList getListado() {
		return this.listado;
	}
	public void setListado(ArrayList listado) {
		this.listado = listado;
	}
}
