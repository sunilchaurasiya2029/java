 import java.util.*;
 public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // bas ek word lega space ke baad ka word ignore karega
        System.out.println(input);
        String input2 = sc.nextLine();// ye pura paragraph lega
        System.out.println(input2);
        int number = sc.nextInt(); //ye bas number lega
        System.out.println(number);
        float price = sc.nextFloat(); // ye bas decimal number lega
        System.out.println(price);
            }
    
}
