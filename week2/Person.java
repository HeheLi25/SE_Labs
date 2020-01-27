package week2;
import java.io.PrintStream;

public class Person {
	private String name;
	private Date dob;
	//constructor
	public Person(String name, Date dob) {
		this.name = name;
		this.dob = dob;
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
