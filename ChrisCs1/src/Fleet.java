import java.util.ArrayList;

public class Fleet {
	private String city;
	private ArrayList<Taxi> taxis;
	
	public Fleet(String city) {
		this.city = city;
		this.taxis = new ArrayList<>();
	}
	
	public void storeTaxi(Taxi t) {
		taxis.add(t);
	}

	public String getCity() {
		return city;
	}

	public ArrayList<Taxi> getTaxis() {
		return taxis;
	}
	
	public double getTotalAutonomy() {
		double total = 0;
		for(Taxi t:taxis) {
			total+=t.autonomy();
		}
		return total;
	}
	
	public int totalTaxis() {
		return taxis.size();
	}
}
