
public class Main {
	public static void main(String[] args) {
		Worker w1 = new Worker("aaa", 1, 2, 1991);
		Worker w2 = new Worker("bbb", 3, 4, 1993);
		Worker w3 = new Worker("ccc", 5, 6, 1995);
		
		Boss b1 = new Boss("ddd", 7, 8, 1997);
		Boss b2 = new Boss("eee", 9, 10, 1999);
		
		 b1.addWorker(w1);
		 b1.addWorker(w2);
		 b1.addWorker(w3);
		 
		 b1.print(System.out);		
		 b2.print(System.out);		
		 w1.print(System.out);		
		 w2.print(System.out);		
		 w3.print(System.out);		
	}

}
