package arrays.labs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ela {
    public static void main(String[] args){

        printCurrentTime();
    }
    public static void  printCurrentTime(){
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

    }
}
