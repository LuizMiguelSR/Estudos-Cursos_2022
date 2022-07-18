package secao07Classes;

public class Vehicle {
	// The Vehicle class has two fields
	private String make;
	private int milesPerGallon;

	// construtor
	public Vehicle() {
	}// end construtor
		// mutator/setter methods

	public void setMake(String m) {
		make = m;
	}// fim do método setMake

	public void setMilesPerGallon(int mpg) {
		milesPerGallon = mpg;
	}// end method setMilesPerGallon

	public String getMake() {
		return make;
	}// fim do método getMake

	public int getMilesPerGallon() {
		return milesPerGallon;
	}// fim do método getMilesPerGallon
}// fim da classe Vehicle
