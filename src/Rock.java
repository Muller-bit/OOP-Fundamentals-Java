
public class Rock {
 
	private String color ;
	private float weight;
	//with parameter
	public Rock(String color, float weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	//with default 
	public Rock() {
		this.color = "black";
		this.weight = 1.5f;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Rock [color=" + color + ", weight=" + weight + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}
