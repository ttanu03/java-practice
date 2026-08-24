package filehandlingdata;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class InputDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.out.println("Enter Any Date below:");

        int enterYear = 2016;

        int enterMonth = 01;

        int enterDay = 04;

        LocalDate localDate = LocalDate.of(enterYear, enterMonth, enterDay);

        // LocalDate date = LocalDate.now();

        DayOfWeek day = DayOfWeek.of(localDate.get(ChronoField.DAY_OF_WEEK));

        switch (day) {

        case SATURDAY:

                        System.out.println("Weekend - Saturday");

                        break;

        case SUNDAY:

                        System.out.println("Weekend - Sunday");

                        break;

        default:

                        System.out.println("Day of the week is: " + day);

                        System.out.println("Not a Weekend");

                        break;

        }

}


	}


