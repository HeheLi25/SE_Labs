package week2.People;
import java.io.PrintStream;

public class Person {
	private String name;
	private Date dob;
	//constructor
	public Person(String name, Date d) {
		this.name = name;
		this.dob = (Date) d.clone();
	}
	//methods
	public void print(PrintStream ps) {
		ps.print("Name: " + name + "\nDate of birth: ");
		dob.print(ps);
	}
	public int getAge(Date curr) {
		if(dob.getYear() >= curr.getYear()) return 0;
		else return dob.diffInYears(curr);
	}
	public String getName() {
		return name;
	}

	

}
