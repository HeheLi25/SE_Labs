package week2;

import week2.Office.Boss;
import week2.Office.Worker;
import week2.People.BetterLop;
import week2.People.Date;

public class Test {

	public static void main(String[] args) {


		Date d1 = new Date(05, 05, 2008);
		Date d2 = new Date(01, 01, 1997);
		Date d3 = new Date(21, 06, 1991);



		Boss p1 = new Boss("Tom", d1);
		Boss p2 = new Boss("Jerry", d2);
		Worker p3 = new Worker("Tim", d3, p1);
		Worker p4 = new Worker("Bob", d1, p1);
		Worker p5 = new Worker("Mark", d2, p1);

		BetterLop l = new BetterLop();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.print(System.out);
		System.out.println("-------------------------------");
		p1.next().print(System.out);
		System.out.println();
		p1.next().print(System.out);
		System.out.println("-------------------------------");
		p3.new_boss(p2);
		l.print(System.out);
		

//		l.print(System.out);
//		System.out.println("-------------------------------");
//		l.find("Tim").print(System.out);
//		System.out.println(l.find("Mary"));
//		System.out.println("-------------------------------");
//		l.remove(p1);
//		l.print(System.out);

		// test BetterLop

//
//		l2.print(System.out);
//		System.out.println("-------------------------------");
//		l2.find("Tim").print(System.out);
//		System.out.println(l2.find("Mary"));
//		System.out.println("-------------------------------");
//		l2.remove(p1);
//		l2.print(System.out);

	}

}
