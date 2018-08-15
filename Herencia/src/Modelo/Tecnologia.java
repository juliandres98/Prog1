package Modelo;

public class Tecnologia extends Empleado {

	private int Programas;
	private int Propios;
	
	public int getProgramas() {
		return Programas;
	}

	public void setProgramas(int programas) {
		Programas = programas;
	}

	public int getPropios() {
		return Propios;
	}

	public void setInovacion(int propios) {
		this.Propios = propios;
	}
	
	public Tecnologia(String nombre, int edad) {

		super(nombre, edad);
		this.Programas = 15;
		this.Propios=6;

	}
	
	public void Creacion()
	{
		
		System.out.println("La cantidad de programas producidos es: " + this.Programas);
		System.out.println("La cantidad de programas creados es: " + this.Propios);
		
	}
	
}
