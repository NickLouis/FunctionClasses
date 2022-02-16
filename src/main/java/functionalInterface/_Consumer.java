package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		Consumer <Customer> cust = customer -> {
			//customer = new Customer("Maria", "07868686861");
			System.out.println(customer);
		};
		cust.accept(new Customer("Maria", "07868686861"));
		
		
	
		BiConsumer <Customer, Boolean> cust2 = (customer, showPhone) -> {
			//customer = new Customer("Maria", "07868686861");
			System.out.println(customer.name +(showPhone ? customer.phoneNo : "*************"));
		};
		
		cust2.accept(new Customer("Maria", "07868686861"), false);
	}
	
	
	static class Customer{
		String name;
		String phoneNo;
		public Customer(String name, String phoneNo) {
			this.name = name;
			this.phoneNo = phoneNo;
		}
		@Override
		public String toString() {
			return "Customer [name=" + name + ", phoneNo=" + phoneNo + "]";
		}
		
	}

}
