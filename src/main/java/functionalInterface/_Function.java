package functionalInterface;

import java.util.function.*;

public class _Function {

	public static void main(String[] args) {
		
		//Function about 22 mins onward
		Function<Integer,Integer> plusOne= num -> num++;
		Function<Integer,Integer> timesTen= num -> num*10;
		Function<Integer,Integer> plusOneThenTimesTen= plusOne.andThen(timesTen);	
		System.out.println(plusOneThenTimesTen.apply(3));

		
		//Bi-Function about 36 mins onward
		BiFunction<Integer,Integer,Integer> multiply = 
				(num1, num2) -> num1 * num2;
				
		System.out.println("Multiply =" +	multiply.apply(2,3));
		
	}


}
