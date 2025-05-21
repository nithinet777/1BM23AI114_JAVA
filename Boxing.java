public class Boxing {
    public static void main(String[] args){
        Double temp1 = Double.valueOf(33);
        Double temp2 = Double.valueOf(20.5);
        Double temp3 = Double.valueOf(32);

        double unboxedDouble1 = temp1.doubleValue();
        double unboxedDouble2 = temp2.doubleValue();
        double unboxedDouble3 = temp3.doubleValue();

        System.out.println("Boxed Double: " + temp1);
        System.out.println("Unboxed Double: " + unboxedDouble1);

        System.out.println("Boxed Double: " + temp2);
        System.out.println("Unboxed Double: " + unboxedDouble2);

        System.out.println("Boxed Double: " + temp3);
        System.out.println("Unboxed Double: " + unboxedDouble3);

        double average=(unboxedDouble1+unboxedDouble2+unboxedDouble3)/3;

        System.out.println("average:"+average);




    }


}
