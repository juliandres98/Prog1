package Modelo;

public class Comercial extends Gerente {

	private int Ventas;
	private int Publicidad;
	
	public int getVentas() {
		return Ventas;
	}

	public void setVentas(int ventas) {
		Ventas = ventas;
	}

	public int getPublicidad() {
		return Publicidad;
	}

	public void setPublicidad(int publicidad) {
		Publicidad = publicidad;
	}

	public Comercial(String nombre, int edad) {
		
		super(nombre, edad);
		this.Ventas = 5;
		
	}
	
	public void P_atraidas()
	{
		System.out.println("La cantidad total de ventas fue: " + this.Ventas );
	}
	
	
	
}
