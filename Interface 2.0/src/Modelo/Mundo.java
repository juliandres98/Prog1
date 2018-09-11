package Modelo;

public class Mundo {
	Superman sup;
	Seaplane sea;
	Bird PAJARO;
	Helicopter hel;

	public Mundo() {
		sup = new Superman();
		sea = new Seaplane();
		hel = new Helicopter();
		PAJARO = new Bird();
	}

	public Superman getSup() {
		return sup;
	}

	public void setSup(Superman sup) {
		this.sup = sup;
	}

	public Seaplane getSea() {
		return sea;
	}

	public void setSea(Seaplane sea) {
		this.sea = sea;
	}

	public Bird getPAJARO() {
		return PAJARO;
	}

	public void setPAJARO(Bird pAJARO) {
		PAJARO = pAJARO;
	}

	public Helicopter getHel() {
		return hel;
	}

	public void setHel(Helicopter hel) {
		this.hel = hel;
	}
	
	
}
