package dateProbs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IncrementDate {

    public static void main(String[] args)
    {
        DateFormat dateFormat = new SimpleDateFormat("EEEEE, MMMMM d,yyyy");
        Calendar c = Calendar.getInstance();
        System.out.println("Today's date :"+c.getTime());

        //Increased Date by 29
        c.add(Calendar.DATE,29);
        String modifiedDate = dateFormat.format(c.getTime());
        System.out.println("Date incremented by 29 :"+modifiedDate);


        //Decreased Date by 39
        c.add(Calendar.DATE,-39);
        String modifiedDate2 = dateFormat.format(c.getTime());
        System.out.println("Date decremented by 39 :"+modifiedDate2);

        String prt1 = modifiedDate.substring(modifiedDate.indexOf(" "),modifiedDate.lastIndexOf(","));
        System.out.println(prt1);
    }
}
