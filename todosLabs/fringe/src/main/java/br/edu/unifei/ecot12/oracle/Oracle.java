package br.edu.unifei.ecot12.oracle;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Oracle {
    
    private static Oracle unique = new Oracle();
    private Calendar end = 
                    new GregorianCalendar(2012, 12, 22);
    private boolean rainy;
    private Oracle() {}

    public static Oracle getInstance(){
        return unique;
    }
}
