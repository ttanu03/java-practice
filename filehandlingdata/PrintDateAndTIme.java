package filehandlingdata;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintDateAndTIme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day,month,year;
		int second,minute,hour;
        GregorianCalendar date = new GregorianCalendar();

        day=date.get(Calendar.DAY_OF_MONTH);
        month=date.get(Calendar.MONTH);
        year=date.get(Calendar.YEAR);
        second=date.get(Calendar.SECOND);
        minute=date.get(Calendar.MINUTE);
        hour=date.get(Calendar.HOUR);
        
        
        System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);

        System.out.println("Current time is  "+hour+" : "+minute+" : "+second);

        System.out.println(day);
        System.out.println(month);
        System.out.println(year); 
        System.out.println(second);
        System.out.println(minute);
        System.out.println(hour);
        
        

	}

}
