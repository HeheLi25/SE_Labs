package week2.Office;

import java.io.PrintStream;
import java.util.ArrayList;

import week2.People.Date;
import week2.People.Person;


public class Boss extends Person{
	private ArrayList<Worker> workers;
	private int position;
	
	public Boss(String name, Date dob) {
		super(name, dob);
		workers = new ArrayList<Worker>();
		position = 0;
	}
	
	public void add_worker(Worker worker) {
		workers.add(worker);
	}
	public void sub_worker(Worker worker) {
		workers.remove(worker);
	}
	public Worker next() {
		return workers.get(position++);
	}
	public void reset() {
		position = 0;
	}
	public void print(PrintStream ps) {
		super.print(ps);
		ps.print("Workers: ");
		for(int i = 0; i < workers.size();i++) {
			ps.print(workers.get(i).getName()+ ";");
		}
		ps.println();
	}
	public ArrayList<Worker> getWorkers(){
		return workers;
	}
}
