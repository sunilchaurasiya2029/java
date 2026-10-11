import java.util.*;
public class castig {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float a = 78.98f;
        int b = (int)a; // isme data loss ho jata hai 
        System.out.println(b); //isme hm jabardasti float ko int me convert kar rahe hai 
        char ch = 'a';
        int number = ch; // isme a ka ascii value print hoga 97
        System.out.println(number);
    }
    
}
