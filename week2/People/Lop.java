package week2.People;

import java.io.PrintStream;

public class Lop {
	private Person[] people = new Person[100];
	private int num;
	
	public Lop() {
		num = 0;
	}
	
	public void add(Person p) {
		if(num >= people.length) {
			System.out.println("Array full");
			return;
		}
		people[num] = p;
		num++;
	}
	public void remove(Person p) {
		for(int i = 0; i < num; i++) {
			if(people[i].equals(p)) {
				for(int j = i; j < num; j++) {
					people[j] = people[j+1];
				}
			num--;
			}
		}
	}
	public Person find(String name) {
		for(int i = 0; i < num; i++) {
			if(people[i].getName().equals(name)) {
				return people[i];
			}
		}
		return null;
	}
	public void print(PrintStream ps) {
		for(int i = 0; i < num; i++) {
			people[i].print(ps);
			ps.println();
		}
	}
}
