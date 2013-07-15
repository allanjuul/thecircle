package dk.aju.test.ajutest1;

import java.util.Calendar;
import java.util.Locale;

public class App {

    public static void main( String[] args ) {
        String unixTimeStamp = "1400439600";
        Long unix = Long.valueOf( unixTimeStamp );
        unix = unix * 1000L;

        Calendar c = Calendar.getInstance();
        c.setTimeInMillis( unix );

        Locale l = new Locale("da", "dk");

        String weekDay = c.getDisplayName( Calendar.DAY_OF_WEEK, Calendar.LONG,  l);
        String monthDay = c.getDisplayName( Calendar.MONTH, Calendar.LONG, l);

        String year = c.get( Calendar.YEAR ) + "";
        String date = c.get( Calendar.DATE ) + "";


        System.out.println( weekDay + " " + date + ". " + monthDay+ " " + year );

    }
}
