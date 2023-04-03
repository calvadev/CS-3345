import java.util.HashMap;

class City {
	HashMap time = new HashMap();
	HashMap cost = new HashMap();
	String name;

	public City() {
		name = "";
	}
	
	@Override
	public String toString() {
		return time.toString() + " " + cost.toString();
	}
}
