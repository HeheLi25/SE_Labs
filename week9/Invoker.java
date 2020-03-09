package week9;

import javax.swing.JOptionPane;

public class Invoker {
	private Command c;
	public void register(Command c) {
		this.c = c;
	}
	public void run() {
		boolean start = true;
		while(start) {
			String s = JOptionPane.showInputDialog("Input");
			if(s.length()<1)continue;
			char a = s.charAt(0);
			System.out.println(s.substring(1));
			if(a == '1'||a == '2') c.execute(Integer.parseInt(a+""));
			else if(a =='q')start = false;		
		}
	}

}
