import java.io.PrintStream;

public class Worker extends Person{

	public Worker(String n, int d, int m, int y) {
		super(n, d, m, y);
		// TODO Auto-generated constructor stub
	}
	public void print(PrintStream ps) {
		ps.print(String.format("%s:born on %02d/%02d/%04d", getName(), getDob_d(),getDob_m(),getDob_y()));
		ps.print(" is bossed by " + getBoss().getName());
		System.out.print("\n");
	}
	

}
