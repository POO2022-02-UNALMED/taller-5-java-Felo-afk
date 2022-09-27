package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
	private ArrayList<Reptil> listado=new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public Reptil() {
		this(null, 0, null, null, null, 0)
	}
	}
	public void cantidadReptiles() {
		return listado.size();
	}
	@override
	public String movimiento() {
		return "reptar";
	}
	public Reptil crearIguana(String nombre, int edad, String genero)  {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		listado.add(iguana);
		iguanas++;
		return iguana;
	}
	public Reptil crearSerpiente(String nombre, int edad, String genero)  {
		Reptil serpiente = new Reptil(nombre, edad, "selva", genero, "blanco", 1);
		listado.add(serpiente);
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
