import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Fleet> fleets = new ArrayList<>();
		
		Fleet fleet1 = new Fleet("Ηράκλειο");
		Fleet fleet2 = new Fleet("Ρέθυμνο");
		
		GasolineTaxi gs1 = new GasolineTaxi("license1", "Christodoulou Christos", 60, 8.9);
		GasolineTaxi gs2 = new GasolineTaxi("license2", "Random Name", 55, 5.1);
		
		ElectricalTaxi el1 = new ElectricalTaxi("license3", "Another Random", 5);
		ElectricalTaxi el2 = new ElectricalTaxi("license4", "Random Again", 10);
		
		fleet1.storeTaxi(gs1);
		fleet1.storeTaxi(el1);
		
		fleet2.storeTaxi(gs2);
		fleet2.storeTaxi(el2);
		
		fleets.add(fleet1);
		fleets.add(fleet2);
		
		new GUI(fleets);
		
	}

}
