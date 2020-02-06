package week2.People;
import java.io.PrintStream;
import java.util.ArrayList;

public class BetterLop {
	ArrayList<Person> people = new ArrayList<Person>();
	
	
	public void add(Person p) {
		people.add(p);
	}
	public void remove(Person p) {
		if(people.indexOf(p) != -1) people.remove(people.indexOf(p));
	}
	public Person find(String name) {
		for(Person temp : people) if(temp.getName().equals(name)) return temp;
		return null;
	}
	public void print(PrintStream ps) {
		for(Person temp : people) {
			temp.print(ps);
			ps.println();
		}
	}

}
