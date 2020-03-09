package week9;

public class Test {
	
	public static void main(String[] args) {
		Invoker ivk = new Invoker();
		Mycom com = new Mycom();
		com.set_name("MyCommand");
		ivk.register(com);
		ivk.run();
		com.set_name("NewCommand");
		ivk.run();
	}

}
