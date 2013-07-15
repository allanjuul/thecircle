package dk.aju.test.ajutest1;

import sun.awt.windows.ThemeReader;

public class App {

    public static void main( String[] args ) {
        TheCalendar theCalendar = new TheCalendar();
        String ret = theCalendar.getSomeThing( "1400439600");
        System.out.println( ret );
    }
}
