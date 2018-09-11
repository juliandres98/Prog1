package Modelo;

public class Superman extends Kryptonian implements Flyer {

	private String bullet, leap;

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

	@Override
	public String Kill() {
		die = "nadie escapa de mi";
		return die;
		// TODO Auto-generated method stub

	}

	public String leapBuilding() {
		leap = "ningun edificio me detiene";
		return leap;

	}

	public String stopBullets() {
		bullet = "I am the man of steel";
		return bullet;

	}

	@Override
	public String eat() {

		food = "yo como fruta";
		return food;
		// TODO Auto-generated method stub

	}
}
