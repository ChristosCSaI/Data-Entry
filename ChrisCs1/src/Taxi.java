
public abstract class Taxi {
	protected String License;
	protected String name;
	
	public Taxi(String license, String name) {
		License = license;
		this.name = name;
	}
	
	public String getLicense() {
		return License;
	}


	public String getName() {
		return name;
	}

	public abstract double autonomy();
	
	
	
}
