package week1;
import java.io.PrintStream;

public class Person {
	public Person(String n, int d, int m, int y) {
		name = n;
		dob_d = d;
		dob_m = m;
		dob_y = y;
		
		boss = null;
		worker = new Person[10];
		nworkers = 0;
	}
	
	private String name;
	private int dob_d,dob_m,dob_y;
	private Person boss;
	private Person[] worker;
	private int nworkers;
	
	public int getDob_d() {
		return dob_d;
	}

	public void setDob_d(int dob_d) {
		this.dob_d = dob_d;
	}

	public int getDob_m() {
		return dob_m;
	}

	public void setDob_m(int dob_m) {
		this.dob_m = dob_m;
	}

	public int getDob_y() {
		return dob_y;
	}

	public void setDob_y(int dob_y) {
		this.dob_y = dob_y;
	}

	public Person[] getWorker() {
		return worker;
	}

	public void setWorker(Person[] worker) {
		this.worker = worker;
	}

	public int getNworkers() {
		return nworkers;
	}

	public void setNworkers(int nworkers) {
		this.nworkers = nworkers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Person getBoss() {
		return boss;
	}

	public void setBoss(Person boss) {
		this.boss = boss;
	}

	public void print(PrintStream ps) {
		ps.print(String.format("%s:born on %02d/%02d/%04d", name, dob_d,dob_m,dob_y));
		System.out.print("\n");
	}
}
