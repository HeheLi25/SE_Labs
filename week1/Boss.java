package week1;
import java.io.PrintStream;

public class Boss extends Person{

	public Boss(String n, int d, int m, int y) {
		super(n, d, m, y);
		// TODO Auto-generated constructor stub
	}
	public void print(PrintStream ps) {
		ps.print(String.format("%s:born on %02d/%02d/%04d", getName(), getDob_d(),getDob_m(),getDob_y()));
		ps.print(" bosses: " );
		for(int i = 0; i<getNworkers(); i++)
			ps.print(getWorker()[i].getName()+" ");
		System.out.print("\n");
	}
	public void addWorker(Person w) {
		Person[] p = getWorker();
		int nworkers = getNworkers();
		p[nworkers++] = w;
		setNworkers(nworkers);
		w.setBoss(this);
	}

}
