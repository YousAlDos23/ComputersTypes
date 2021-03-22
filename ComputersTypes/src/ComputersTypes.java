
public class ComputersTypes {
	
	String name;
	String CPU;
	String color;
	double price;

	ComputersTypes() {
		
	}
	
	ComputersTypes(String newName , String newCPU , String newColor , double newPrice) {
		name = newName;
		CPU = newCPU;
		color = newColor;
		price = newPrice;
	}
	
	String getName() {
		return name;
	}
	
	String getCPU() {
		return CPU;
	}
	
	String getColor() {
		return name;
	}
	
	double getPrice() {
		return price;
	}
	
	public void Allinfo(String newName , String newCPU , String newColor , double newPrice) {
		System.out.println("The name is: " + newName);
		System.out.println("The CPU is: " +  newCPU);
		System.out.println("The color is: " + newColor);
		System.out.println("The price is: " + newPrice);
		
	}
}
