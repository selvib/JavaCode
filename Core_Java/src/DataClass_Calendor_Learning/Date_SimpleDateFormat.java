package DataClass_Calendor_Learning;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date d =new Date();
		System.out.println(d);
		//System.out.println(d.toString());
		
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(df.format(d));
		System.out.println(sdf.format(d));

	}

}
