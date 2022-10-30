package review3;

public class Country {
	public String name;
	protected String capital;
	int population;
	private String president;

	public Country() {
		System.out.println("default constructor");
	}

	Country(String name){
		this.name=name;
	}
}
