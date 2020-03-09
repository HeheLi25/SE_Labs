package week9;

public class Mycom implements Command{
	String name;
	public void set_name(String n) {
		name = n;
	}
	public void execute(int i) {
		System.out.println(name+":"+i);
	}

}
