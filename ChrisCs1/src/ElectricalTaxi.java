	
public class ElectricalTaxi extends Taxi{
	private int batteries;
	

	public ElectricalTaxi(String license, String name, int batteries) {
		super(license, name);
		this.batteries = batteries;
	}

	public double autonomy() {
		return 70*this.batteries;
	}
}
