
public class TheTypes {
	public static void main(String[] args) {
		
		ComputersTypes computer1 = new ComputersTypes("hp","intel i7","white",4500);
		ComputersTypes computer2 = new ComputersTypes("MSI","intel i9","black",6799);
		ComputersTypes computer3 = new ComputersTypes("dell","intel i3","white",3479);
		
		
	    System.out.println(computer1.getName());
	    System.out.println(computer1.getPrice());
	    
	    System.out.println();
	    
	    System.out.println(computer2.getName());
	    System.out.println(computer2.getCPU());
	    
	    System.out.println();
	    
	    System.out.println(computer3.getName());
	    System.out.println(computer3.getPrice());
	    
	}
}
