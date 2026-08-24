package filehandlingdata;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date= new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 

String str= formatter.format(date);
System.out.println(str);

}

}
