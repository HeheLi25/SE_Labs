package week2;
public class Test {

	public static void main(String[] args) {

		// test Date

		Date d1 = new Date(05, 05, 2008);
		Date d2 = new Date(01, 01, 1997);
		Date d3 = new Date(21, 06, 1991);
//		d1.print(System.out);
//		System.out.println(String.format("%02d/%02d/%04d", d2.getDay(), d2.getMonth(), d2.getYear()));
//		System.out.println("difference:"+d1.diffInYears(d2));

		// test Person

		Person p1 = new Person("Tom", d1);
		Person p2 = new Person("Jerry", d2);
		Date curr = new Date(20, 1, 2020);
//		p1.print(System.out);
//		System.out.println("Age: "+ p1.getAge(curr));
//		System.out.println();
//		p2.print(System.out);
//		System.out.println("Age: "+ p2.getAge(curr));

		// test Lop

		Person p3 = new Person("Tim", d3);

		Lop l = new Lop();
		l.add(p1);
		l.add(p2);
		l.add(p3);

//		l.print(System.out);
//		System.out.println("-------------------------------");
//		l.find("Tim").print(System.out);
//		System.out.println(l.find("Mary"));
//		System.out.println("-------------------------------");
//		l.remove(p1);
//		l.print(System.out);

		// test BetterLop

		BetterLop l2 = new BetterLop();
		l2.add(p1);
		l2.add(p2);
		l2.add(p3);

		l2.print(System.out);
		System.out.println("-------------------------------");
		l2.find("Tim").print(System.out);
		System.out.println(l2.find("Mary"));
		System.out.println("-------------------------------");
		l2.remove(p1);
		l2.print(System.out);

	}

}
