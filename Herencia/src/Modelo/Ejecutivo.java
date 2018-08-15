package Modelo;

public class Ejecutivo extends Gerente {

	private String Documentos;
	private int Contratos;
	
	
	public String getDocumentos() {
		return Documentos;
	}


	public void setDocumentos(String documentos) {
		Documentos = documentos;
	}


	public int getContratos() {
		return Contratos;
	}


	public void setContratos(int contratos) {
		Contratos = contratos;
	}


	public Ejecutivo(String nombre, int edad) {
		
		super(nombre, edad);
		this.Contratos = 5;
		this.Documentos = "contratos";
		
	}
	
	public void Manejo()
	{
		
		System.out.println("Los documentos que maneja son: " + this.Documentos);
		System.out.println("Ha generado " + this.Contratos + " contratos");
		
	}

}
