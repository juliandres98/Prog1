package Modelo;

public class Empleado extends Persona {
	
	private double salario;
	private String cargo;
	
	
	public Empleado(String nombre, int edad) {
		
		super(nombre, edad);
		this.salario = 18000;
		this.cargo = "Programador";
		
	}

	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void cobrar()
	{
		System.out.println("yo me llamo: " + super.nombre);
		System.out.println("mi cargo: " + this.cargo);
	}
	
}
