
public class PersonDiver {

	public static void main(String[] args) {
	 Person [] people = new Person[5];
	 people[0] = new Person("Sasha");
	 people[1] = new Person("Connie");
	 people[2] = new Person("kei");
	 people[3] = new Professor("Jessica Masters",11);
	 people[4] = new Professor("Pamela Price",15);
	 
	 //Iterate the array and print a text representation of each object
	 for(int i=0; i< people.length; i++) {
		 System.out.println(people[i]);
		 
	 }
	 //Iterate the array and sum up the total number of years taught by all professors 
	 int totalNumYears = 0;
	 for(Person eachPerson: people) {
		 if ( eachPerson instanceof Professor) {
			 Professor anotherProfess = (Professor) eachPerson;
			 totalNumYears += anotherProfess.getYears();
			 }
	 }
	 System.out.println("The total of years taught by all professors are: "+ totalNumYears);
	 
	 
	 
	 
	
		/* for (int i=0; i<people.length; i++) {
			 Person eachPerson = people[i];
			 if ( eachPerson instanceof Professor) {
				 Professor anotherProfess = (Professor) eachPerson;
				 totalNumYears += anotherProfess.getYears();
				 }
		 }*/

    }
}
