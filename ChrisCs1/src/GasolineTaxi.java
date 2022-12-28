
public class GasolineTaxi extends Taxi{
	private int gas;
	private double cons;
	
	
	public GasolineTaxi(String license, String name, int gas, double cons) {
		super(license, name);
		this.gas = gas;
		this.cons = cons;
	}

	public double autonomy() {
		return 90*(this.gas/this.cons	);
	}
}
