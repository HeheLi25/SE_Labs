package week2.Office;

import java.io.PrintStream;
import java.util.ArrayList;

import week2.People.Date;
import week2.People.Person;

public class Worker extends Person{
	private Boss boss;
	public Worker(String name, Date dob, Boss boss) {
		super(name, dob);
		this.boss = boss;
		boss.add_worker(this);
	}

	public Boss get_boss() {
		return boss;
	}
	public void new_boss(Boss newBoss) {
		boss.sub_worker(this);
		this.boss = newBoss;
		newBoss.add_worker(this);
	}
	public void print(PrintStream ps) {
		super.print(ps);
		ps.print("Boss: "+ boss.getName());
		ps.println();
	}
	

}
