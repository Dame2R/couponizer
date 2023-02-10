
public class City extends Continents{
	private String name;
	private int cycle;
	private int level;
	private String continent;
	
	public City(String con1, String n1, int c1, int l1) {
		super(con1);
		this.continent = con1;
		this.name = n1;
		this.cycle = c1;
		this.level = l1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	public String getContinent() {
		return continent;
	}
	
	
}
