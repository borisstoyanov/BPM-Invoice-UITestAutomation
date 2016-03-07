package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.UUID;

import org.joda.time.DateTime;

public class Util {

	public static String getInvoiceNumber() {
		return UUID.randomUUID().toString();
	}

	private static DateTime getDateTime(){
		return new DateTime();
	}
	
	public static String getDate() {
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setTimeZone(tz);
		String nowAsISO = df.format(getDateTime().toDate());
		return nowAsISO;
	}
}
