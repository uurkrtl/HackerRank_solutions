import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException exc){
            String message = exc.toString();
            System.out.println(message.contains(":") ? message.substring(0, message.indexOf(":")) : message);
        }catch(ArithmeticException exc){
            System.out.println(exc.toString());
        }
    }
}