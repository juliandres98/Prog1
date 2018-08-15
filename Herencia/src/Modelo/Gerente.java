package Modelo;

public class Gerente extends Empleado {
	
	
	
	private int Personas_a_cargo;
	private int Documentos_restantes;
	
	
	public int getPersonas_a_cargo() {
		
		return Personas_a_cargo;
		
	}
	public void setPersonas_a_cargo(int personas_a_cargo) {
		
		Personas_a_cargo = personas_a_cargo;
	}
public int getDocumentos_restantes() {
		
		return Documentos_restantes;
		
	}
	public void setDocumentos_restantes(int documentos_restantes) {
		
		Documentos_restantes = documentos_restantes;
	}
	public Gerente(String nombre, int edad) {
		
		super(nombre, edad);
		this.Personas_a_cargo=7;
		this.Documentos_restantes=5;
		
	}
	public void despedir()
	{

		System.out.println("las personas a cargo son: " + this.Personas_a_cargo);
		System.out.println("Estimado  " + super.nombre + " mediante la presente le informamos que esta despedido");

	}	
}
