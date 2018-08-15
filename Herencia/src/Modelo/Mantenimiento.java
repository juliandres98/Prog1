package Modelo;

public class Mantenimiento extends Empleado {
	
	private String Materiales;
	private int Reparados;
	
	public String getMateriales() {
		return Materiales;
	}

	public void setMateriales(String materiales) {
		Materiales = materiales;
	}

	public int getReparados() {
		return Reparados;
	}

	public void setReparados(int reparados) {
		Reparados = reparados;
	}

	public Mantenimiento(String nombre, int edad)
	{
		
		super(nombre, edad);
		this.Materiales = "Plastico";
		this.Reparados = 80;
		
	}
	public void Costos()
	{
		System.out.println("El total de danos a facturar son: " + this.Reparados);
		System.out.println("Se usaron los siguientes materiales: " + this.Materiales);
	}
	
}
