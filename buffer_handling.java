import java.util.Scanner;
public class buffer_handling {
    public static void main(String [] args){
        StringBuffer sb1= new StringBuffer("Nithin");
        System.out.println("capacity of string bufer objects sb1:"+sb1.capacity());
        //reversing the strings
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a string :");
        String inputString=scanner.nextLine();

        StringBuffer reversedBuffer=new StringBuffer(inputString);
        reversedBuffer.reverse();
        String reversedUppercase=reversedBuffer.toString().toUpperCase();
        System.out.println("reversed string in uppercase: "+ reversedUppercase);

        //READING THE STRING FROM THE CONSOLE AND APPENDING IT
        System.out.println("enter the string to append ");
        String appendString=scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("string after append: "+reversedBuffer);


    }
}
