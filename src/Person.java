
public class Person {
	
	public String name;
	
	public String lastName;
	
	public int age;
	
	public boolean worksAtWT;
	
	public int height;
	
	public Person(String name, String lastName, int age, boolean worksAtWT, int height) {
		System.out.println("In constructor");
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.worksAtWT = worksAtWT;
		this.height = height;
		
	}
	
	// Method declaration
	public void printProperties() {
		System.out.println("De eigenschappen van " + name + "\n" + "Naam: " + name + "\n" +  "Achternaam: " + lastName + "\n" + "Leeftijd: " + age + "\n" + "Werkstatus: " + worksAtWT + "\n" + "Lengte: " + height + "\n");
	}
	
	public void setData(String naam, String achternaam, int leeftijd) {
	System.out.println("Dit is de ingestelde data: " + naam + " " + achternaam + " " + leeftijd);
	}
	
	public int whatIsTheAge() {
		return age;
	}
	
	public String whatIsTheName() {
		return name + " " + lastName;
	}
	
	public int whatIsTheHeight() {
		return height;
	}
	
	public boolean worksAtWTstatus() {
		return worksAtWT;
	}
}
