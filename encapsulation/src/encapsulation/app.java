package encapsulation;

class Plant {
	public static final int ID = 7;
	private String name;
	public int setData;

	public String getName() {
		return name;
	}

	public String getData() {
		String data = "some stuff" + calculateGrowthForecast();
		return data;

	}

	private int calculateGrowthForecast() {
		return 9;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setData(int setData) {
		this.setData = setData;
		}

}

public class app {

	public static void main(String[] args) {
		Plant plant1 = new Plant ();
		plant1.setName("roger");
		//plant1.setData = 12;
		System.out.println(plant1.getName());
		System.out.println(plant1.getData());

	}

}
