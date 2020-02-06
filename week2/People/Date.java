package week2.People;
import java.io.PrintStream;

public class Date implements Cloneable{
	private int day;
	private int month;
	private int year;
	//constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	//methods
	public void print(PrintStream ps) {
		ps.print(String.format("%02d/%02d/%04d", day, month, year));
		System.out.println();
	}
	public int diffInYears(Date d) {
		if(d.getYear() == year) return 0;
		Date d1;
		Date d2;
		if(d.getYear()>year) {
			d1 = d;
			d2 = this;
		}else {
			d1 = this;
			d2 = d;
		}
		int diffYear = d1.getYear() - d2.getYear();
		int diffMonth = d1.getMonth() - d2.getMonth();
		int diffDay = d1.getDay() - d2.getDay();
		if(diffMonth > 0) return diffYear;
		else if(diffMonth < 0) return diffYear - 1;
		else{
			if(diffDay >= 0) return diffYear;
			else return diffYear - 1;
		}
	}
	//getters
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return o;
	}
	
	
}
