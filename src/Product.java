
public class Product {
	
	private String name;
	
	private int costs;
	
	public Product() {
		System.out.println("In tweede constructor");
		name = "Unknown";
		costs = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCosts() {
		return costs;
	}

	public void setCosts(int costs) {
		if (costs >= 0)
			this.costs = costs;
	}
	
	
	
}
