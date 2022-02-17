package Date_Time;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Date_Time {
    public static void exercise_13(LocalDateTime date ){
        System.out.println(date.getDayOfWeek());
    }

    public static void exercise_14(){
        System.out.println(LocalDateTime.now().toLocalTime());
    }

    public static boolean exercise_18(int year){
        boolean leap = false;
        //check if the year is divisible by 4
        if (year%4 ==0){
            //check if its a century year
            if (year%100 ==0){
                if (year%400==0){
                    leap = true;
                } else{
                    leap = false;
                }
            } else leap= true;
        }else leap = false;
        return leap;
    }

    public static void main(String[] args) {
        exercise_13(LocalDateTime.now());
        exercise_14();
        System.out.println(exercise_18(2028));
    }
}
