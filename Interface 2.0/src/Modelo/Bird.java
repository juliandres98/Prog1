package Modelo;

public class Bird extends Animal implements Flyer {

	private String nest, egg;

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

	public String buildNest() {
		nest = "home sweet home";
		return nest;

	}

	public String layEggs() {
		egg = "Ay mis hijos";
		return null;

	}

	@Override
	public String eat() {
		return food;
		// TODO Auto-generated method stub

	}
}
