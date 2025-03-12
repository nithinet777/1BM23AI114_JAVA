import java.util.Scanner;

public class gym_membership{
    public static void main(String[] args){
        int i;
        for (i=0;i<4;i++) {
            Scanner sr = new Scanner(System.in);

            System.out.println("Welcome to GYM");
            System.out.println("enter name");
            String name = sr.nextLine();
            System.out.println("enter age");
            int age = sr.nextInt();
            System.out.println("is membership active");
            Boolean status = sr.nextBoolean();
            System.out.println("duration in months");
            int duration = sr.nextInt();

            double fee=500*duration;
            System.out.println("membership fee : "+fee);

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Membership status: " + status);
            System.out.println("Duration: " + duration);
            System.out.println("membership"+((duration==0)?"not active":"active"));
            System.out.println("membership fee : "+fee);
        }


    }
}