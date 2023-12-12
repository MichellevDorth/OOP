
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		Person p1 = new Person("Michelle", "van Dorth", 23, true, 183);

		// Method call
		p1.printProperties();
		int age = p1.whatIsTheAge();
		String name = p1.whatIsTheName();
		int height = p1.whatIsTheHeight();
		boolean workStatus = p1.worksAtWTstatus();
		System.out.println("Leeftijd = " + age + ", Naam = " + name + ", Lengte = " + height + ", Workstatus = " + workStatus + "\n" );
		
		Person p2 = new Person("Tim", "Hammers", 26, true, 175);

		p2.printProperties();
		
		//Person p3 = new Person();
		//p3.setData("voornaam", "achternaam", 0);
		
		Product product1 = new Product();
		product1.setName("TV");
		String productName = product1.getName();
		System.out.println(productName);
		
	}

}
