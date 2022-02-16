package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		//suppliers are basically like getters
		// they don't take arguments but return x
		// requested thing on demand
		Supplier <String> getName = () -> "NicholasTolmie";
		
		
		System.out.println(getName.get());
		

	}
	
	static String getName() {return "NicholasTolmie";}

}
