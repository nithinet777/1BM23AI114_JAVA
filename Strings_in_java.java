public class Strings_in_java {
    public static boolean compareStrings(String str1,String str2){
        return str1.equals(str2);
    }
    public static String copyString(String original){
        return new String(original);
    }

    public static String concatinateStrings(String string1,String string2){
        return string1.concat(string2);
    }

    public static void main (String[] args){
        String str1="Hello";
        String str2="hello";
        System.out.println("comparing two strings : "+compareStrings(str1,str2));

        String str3="nemdi yaag baduku";
        System.out.println("copying strings : now it represented as:"+copyString(str3));

        String string1="wanna be ";
        String string2="yours";
        System.out.println("after concatination:"+concatinateStrings(string1,string2));

    }
}
