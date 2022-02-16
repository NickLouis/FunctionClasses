package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import streams._Stream.Gender;

import static streams._Stream.Gender.*;

public class _Stream {
	
	enum Gender {
		MALE,FEMALE,NON_BINARY;
	}
	

	public static void main(String[] args) {
		List <Person> people = List.of(new Person("Tom", NON_BINARY)
									,new Person("Tommy", MALE)
									,new Person("Tomina", FEMALE)
									,new Person("Tomatha", FEMALE));
		
		
		boolean tom= people.stream().allMatch(person -> person.name.contains("Tom"));
		System.out.println("Toms? -> " + tom);
		System.out.println("Raabss? -> "+ people.stream().anyMatch(person -> person.name.equals("Raab")));
		
		people.stream()
		.map( person -> person.gender)
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		

	}
	
	static class Person{
		String name;
		Gender gender;
		
		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
	}

}
