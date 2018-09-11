package Modelo;

public class Helicopter extends Airplane {

	@Override
	public String Moverse() {
		
		movimiento = "hay gasolina?";
		return movimiento;
		// TODO Auto-generated method stub

	}

	@Override
	public String plane() {
		planear = "hay que caer con cuidaaado";
		return planear;
		// TODO Auto-generated method stub

	}

	@Override
	public String takeOff() {
		return take;
		// TODO Auto-generated method stub

	}

	@Override
	public String land() {
		return la;
		// TODO Auto-generated method stub

	}

	@Override
	public String fly() {
		return fl;
		// TODO Auto-generated method stub

	}

}
