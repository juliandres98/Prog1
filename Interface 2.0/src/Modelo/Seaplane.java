package Modelo;

public class Seaplane extends Airplane {

	@Override
	public String Moverse() {
		movimiento = "Im ready for the action";
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public String plane() {
		planear = "en el agua no, EN EL AGUA NOOO!!!";
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
