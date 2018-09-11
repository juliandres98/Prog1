package Controlador;

import Modelo.Mundo;
import Vista.InterfazGrafica;

public class Controlador {
	Mundo m;
	InterfazGrafica gui;

	public Controlador() {
		m = new Mundo();
		gui = new InterfazGrafica();
		
		/*
		 * Superman
		 */
		
		gui.frase(m.getSup().takeOff());
		gui.frase(m.getSup().fly());
		gui.frase(m.getSup().land());
		gui.frase(m.getSup().eat());
		gui.frase(m.getSup().leapBuilding());
		gui.frase(m.getSup().stopBullets());
		gui.frase(m.getSup().Kill());
		
		/*
		 * Helicoptero
		 */
		
		gui.frase(m.getHel().fly());
		gui.frase(m.getHel().land());
		gui.frase(m.getHel().takeOff());
		gui.frase(m.getHel().Moverse());
		gui.frase(m.getHel().plane());
		
		/*
		 * Pajaro
		 */

		gui.frase(m.getPAJARO().buildNest());
		gui.frase(m.getPAJARO().layEggs());
		gui.frase(m.getPAJARO().eat());
		gui.frase(m.getPAJARO().fly());
		gui.frase(m.getPAJARO().land());
		gui.frase(m.getPAJARO().takeOff());

		/*
		 * Seaplane
		 */
		
		gui.frase(m.getSea().fly());
		gui.frase(m.getSea().land());
		gui.frase(m.getSea().takeOff());
		gui.frase(m.getSea().Moverse());
		gui.frase(m.getSea().plane());
		
	}
}
