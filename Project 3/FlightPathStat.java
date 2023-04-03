class FlightPathStat implements Cloneable {
	private int time;
	private int cost;
	private String path;

	FlightPathStat() {
		setTime(0);
		setCost(0);
		setFlightPath(new String());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Time = " + getTime() + "Cost = " + getCost() + "FlightPath = " + getFlightPath();
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getFlightPath() {
		return path;
	}

	public void setFlightPath(String path) {
		this.path = path;
	}
}