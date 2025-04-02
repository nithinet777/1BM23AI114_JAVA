import java.util.Scanner;
public class enumeration {
    public enum Daysofweek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean isWorkday(){
            return(this!=SATURDAY && this!=SUNDAY);
        }
    }
    public static void main(String[] args){
        System.out.println("is monday a work day?"+Daysofweek.MONDAY.isWorkday());
        System.out.println("is saturday is a workday?"+Daysofweek.SATURDAY.isWorkday());
    }
}
//is monday a work day?true
//is saturday is a workday?false