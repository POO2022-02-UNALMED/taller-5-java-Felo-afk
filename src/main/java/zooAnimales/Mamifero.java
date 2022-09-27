package zooAnimales;
import java.util.ArrayList;
public class Mamifero {
	private ArrayList<Mamifero> listado=new ArrayList<Mamifero>();
	public  static int caballos = 0;
	public  static int leones = 0;
	private boolean pelaje;
	private int patas;

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero); 
		this.pelaje = pelaje;
		this.patas =  patas;
	}
	public Mamifero() {
		this(null, 0, null, null, false, 0);
	}
	
	public int cantidadMamiferos() {
		return listado.size();	
	}
	public  Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		listado.add(leon);
		leones++;
		return leon;
	}
	public Mamifero crearCaballo(String nombre, int edad, String genero)  {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		listado.add(caballo);
		caballos++;
		return caballo;
	}
	public int cantidadMamiferos() {
		return listado.size();
	}
	public boolean isPelaje() {
		return this.pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setpatas(int patas) {
		this.patas = patas;
	}
	public ArrayList getListado() {
		return this.listado;
	}
	public void setListado(ArrayList listado) {
		this.listado = listado;
	}
}
