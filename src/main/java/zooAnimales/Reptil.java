package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
	private static ArrayList<Reptil> listado=new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil() {
		listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public static int cantidadReptiles() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero)  {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero)  {
		Reptil serpiente = new Reptil(nombre, edad, "selva", genero, "blanco", 1);
		serpientes++;
		return serpiente;
		
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return this.largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public ArrayList getListado() {
		return this.listado;
	}
	public void setListado(ArrayList listado) {
		this.listado = listado;
	}
	
}
