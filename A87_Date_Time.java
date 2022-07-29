import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@SuppressWarnings("all")
public class A87_Date_Time {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		long year=(System.currentTimeMillis()/1000/60/60/24/365);
		System.out.println(year);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println((Long.MAX_VALUE/1000/60/60/24/365));
		//Date d=new Date(System.currentTimeMillis());
		//java 8
		
		Date d=new Date();//MM-DD-YYYY
		System.out.println(d);
		System.out.println("Date    : "+d.getDate());
		System.out.println("Day     : "+d.getDay());
		System.out.println("Month   : "+d.getMonth());
		System.out.println("Year    : "+(d.getYear()+1900));
		System.out.println("Time    : "+d.getTime());
		System.out.println("Hours   : "+d.getHours());
		System.out.println("Minutes : "+d.getMinutes());
		System.out.println("Seconds : "+d.getSeconds());
		
		GregorianCalendar o=new GregorianCalendar();
		System.out.println(o);
		System.out.println(o.isLeapYear(2020));
		System.out.println("Date       : "+o.get(Calendar.DATE));
		System.out.println("Month      : "+o.get(Calendar.MONDAY));
		System.out.println("Year       : "+o.get(Calendar.YEAR));
		System.out.println("Day of Week: "+o.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of Year: "+o.get(Calendar.DAY_OF_YEAR));
		
		
		
	}

}
