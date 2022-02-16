package streams;

import java.util.List;
import static streams._Stream.Gender.*;

public class _Stream {
	
	enum Gender {
		MALE,FEMALE;
	}
	

	public static void main(String[] args) {
		List <Person> people = List.of(new Person("Tom", MALE));

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
