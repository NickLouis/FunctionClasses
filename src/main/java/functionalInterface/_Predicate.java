package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		Predicate <String> isValidName = name -> name.length()==8 && name.startsWith("N");
		Predicate <String> isCalledMick = name -> name.equals("Mick");
		System.out.println("Nicholas is valid " + isValidName.test("Nicholas"));
		System.out.println("Mick is valid " + isValidName.test("Mick"));
		
		// using the and and/or operators here is handy 
		System.out.println("Mick gets a pass " + isValidName.or(isCalledMick).test("Mick"));
		
		// Look into Bi-predicates
	}

}
