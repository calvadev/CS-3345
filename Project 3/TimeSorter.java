import java.util.Comparator;

class TimeSorter implements Comparator<FlightPathStat> {
	@Override
	public int compare(FlightPathStat o1, FlightPathStat o2) {
		return o1.getTime() - o2.getTime();
	}
}
