import java.util.Comparator;

class CostSorter implements Comparator<FlightPathStat> {
	@Override
	public int compare(FlightPathStat o1, FlightPathStat o2) {
		return o1.getCost() - o2.getCost();
	}
}
