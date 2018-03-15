public class Person{

    private String firstName;
		private String lastName;
		private int age;

		public Person(String firstName, String lastName, int age){

		    this.firstName = firstName;
				this.lastName = lastName;
				this.age = age;
		}

		public void display(){

		    System.out.printf("First name: %s%n", firstName);
				System.out.printf("Last name: %s%n", lastName);
				System.out.printf("Age: %d%n%n", age);
		}

		public String getLastName(){
		    return lastName;
		}
}
