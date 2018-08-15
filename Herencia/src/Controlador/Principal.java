//Julian Andres Puentes Ruiz
package Controlador;
import Modelo.*;

public class Principal {

		private static Comercial emp1;
		private static Ejecutivo emp2;
		private static Mantenimiento emp3;
		private static Tecnologia emp4;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp1 = new Comercial ("Julian Puentes", 20);
		emp2 = new Ejecutivo ("Julian Puentes", 20);
		emp3 = new Mantenimiento ("Julian Puentes", 20);
		emp4 = new Tecnologia ("Julian Puentes", 20);
		
		
		emp1.correr();
		emp1.cobrar();
		emp1.P_atraidas();
		emp2.Manejo();
		emp3.Costos();
		emp4.Creacion();
		emp1.despedir();
		
	}

}
